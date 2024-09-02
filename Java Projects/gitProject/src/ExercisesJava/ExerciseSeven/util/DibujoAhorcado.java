package ExercisesJava.ExerciseSeven.util;

import java.util.HashMap;
import java.util.Map;

public class DibujoAhorcado {


    //Creo un hash map para cada parte del ahorcado según el número de errores
    Map<Integer, String> estadoAhorcado = new HashMap<>();

    public DibujoAhorcado() {

        estadoAhorcado.put(6, """
        ______
             |     |
             |
             |
             |
             |
             """);
        estadoAhorcado.put(5, """
             _______
             |     |
             |     O
             |
             |
             |
             """);
        estadoAhorcado.put(4, """
             _______
             |     |
             |     O
             |     |
             |
             |
             """);
        estadoAhorcado.put(3, """
             _______
             |     |
             |     O
             |    /|
             |
             |
             """);
        estadoAhorcado.put(2, """
             _______
             |     |
             |     O
             |    /|\\
             |
             |
             """);
        estadoAhorcado.put(1, """
             _______
             |     |
             |     O
             |    /|\\
             |    /
             |
             """);
        estadoAhorcado.put(0, """
                _______
                |     |
                |     O
                |    /|\\
                |    / \\
                |
                """);


    }

}
