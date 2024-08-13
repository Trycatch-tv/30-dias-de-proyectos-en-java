package ExercisesJava.ExerciseSeven.util;

import ExercisesJava.ExerciseFive.Util;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UtilAhorcado {

    DibujoAhorcado du = new DibujoAhorcado();
    Scanner sc = new Scanner(System.in);
    private static int vidas;
    private String palabra;
    private StringBuilder palabraOculta;
    private Set<Character> letrasAdivinadas;

    public UtilAhorcado() {
        vidas = 6;
        logicaJuego();

    }

    public void logicaJuego() {

        System.out.println("Palabra:");
        this.palabra = sc.nextLine();
        this.palabraOculta = new StringBuilder();
        this.letrasAdivinadas = new HashSet<>();
        inicializandoPalabraOculta();
        System.out.println(palabraOculta);
        while (vidas > 0 && palabraOculta.indexOf("-") !=-1) {

            adivinarLetra();
            System.out.println(palabraOculta);

        }


    }

    public void inicializandoPalabraOculta() {

        for (int i = 0; i < palabra.length(); i++) {

            palabraOculta.append('-');
        }

    }

    public void adivinarLetra() {

        System.out.println("Ingrese letra");
        String input = sc.nextLine();
        char caracter = input.charAt(0);
        int index = palabra.indexOf(caracter);


        if (index != -1) {

            while (index != -1) {
                palabraOculta.setCharAt(index, caracter);

                if(palabraOculta.indexOf("-")==-1){

                    System.out.println("Has ganado!!");

                    break;
                }
                index = palabra.indexOf(caracter, index + 1);

            }

        } else {
            vidas -= 1;
            System.out.println(du.estadoAhorcado.get(vidas));


        }


    }


}
