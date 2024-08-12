package ExercisesJava.ExerciseSeven.util;

import java.util.Scanner;

public class UtilAhorcado {

    private String palabra;
    Scanner sc = new Scanner(System.in);

    public UtilAhorcado() {

        pedirPalabra();

    }

    
    public void pedirPalabra(){

        System.out.println("Palabra: ");

        palabra = sc.nextLine();
        
    }

    public String getPalabra() {
        return palabra;
    }
}
