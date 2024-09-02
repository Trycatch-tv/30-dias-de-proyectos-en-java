package ExercisesJava.ExerciseThree;

import java.util.Random;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Util {

    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void jugar() {
        BiPredicate<Integer, Integer> val = (x, y) -> x == y;
        System.out.println(val.test(pedirNumero(), generarNumeroAleatorio()) ? "Ganaste" : "Perdiste");

    }

    public int pedirNumero() {
        System.out.println("Número entre 1 y 10");
        int userNumber = sc.nextInt();
        return userNumber;
    }

    public int generarNumeroAleatorio() {
        int generatedNumber = r.nextInt(10) + 1;
        System.out.println(generatedNumber);
        return generatedNumber;
    }

}
