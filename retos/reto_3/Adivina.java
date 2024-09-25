import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Adivina {
    
    public static void main(String[] args) {
        int numero =  ThreadLocalRandom.current().nextInt(1, 100);
        Scanner scanner = new Scanner(System.in);
        int ingreso;
        do {
            System.out.println("Intenta adivinar el número. Ingresa un numero del 1 al 100: ");
            ingreso = scanner.nextInt();
            if (ingreso < numero){
                System.out.println("El numero es mayor al que elegiste, volve a intentar: ");
            } else {
                System.err.println("El numero es menor al que ingresaste, volve a intentar: ");
            }
        } while (ingreso != numero);
        System.out.println("Adivinaste, el numero era: "+ numero);
    }
}