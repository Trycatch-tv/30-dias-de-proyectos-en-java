package ExercisesJava.ExerciseTwop;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Util {

    Scanner sc = new Scanner(System.in);

    public int menuOptions(){
        System.out.println("Elija su operación: \n1.- SUMA\n2.- RESTA\n3.- MULTIPLICACIÓN\n4.- DIVISIÓN ");
        
        return sc.nextInt();

    }
    
    public double sumar(){
        double total;

        System.out.println("Ingrese los números a sumar");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        BiFunction<Double, Double, Double> sumaBiFunction = (a, b) -> a+b;
        total = sumaBiFunction.apply(num1, num2);
        return total;
    }

    public double restar(){
        double total;

        System.out.println("Ingrese los números a restar");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        BiFunction<Double, Double, Double> sumaBiFunction = (a, b) -> a-b;
        total = sumaBiFunction.apply(num1, num2);
        return total;
    }
    
    public double dividir(){
        double total;

        System.out.println("Ingrese los números a dividir");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        BiFunction<Double, Double, Double> sumaBiFunction = (a, b) -> a/b;
        total = sumaBiFunction.apply(num1, num2);
        return total;
    }
    public double multiplicar(){
        double total;

        System.out.println("Ingrese los números a multiplicar");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        BiFunction<Double, Double, Double> sumaBiFunction = (a, b) -> a*b;
        total = sumaBiFunction.apply(num1, num2);
        return total;
    }


}
