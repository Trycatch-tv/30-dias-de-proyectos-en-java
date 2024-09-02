package ExercisesJava.ExeerciseFour;

import java.util.Scanner;

public class Util {

    Scanner sc = new Scanner(System.in);
    Unidades un = new Unidades();

    public void mainMenu() {

        System.out.println("Unidad a convertir: \n" +
                "1.- metros\n" +
                "2.- kilómetros\n" +
                "3.- yardas\n" +
                "4.- centímetros");
        int option = sc.nextInt();

                switch (option) {
                    case 1:
                        mConverter();
                        break;
                
                    case 2:
                        kmsConverter();
                        break;
                
                    case 3:
                        ydConverter();
                        break;
                
                    case 4:
                        cmsConverter();
                        break;
                
                    default:
                        break;
                }

    }

    public void  cmsConverter() {
        System.out.println("De centímetros a: \n1.- metros\n2.- kilómetros\n3.- yardas");
        int option = sc.nextInt();
        System.out.println("Valor a convertir");

        double toConvert = sc.nextDouble();
        switch (option) {
            case 1:

                System.out.println((toConvert * un.getCm()) / 100);

                break;
            case 2:
                System.out.println((toConvert * un.getCm()) / 100000);

                break;
            case 3:

                System.out.println((toConvert * un.getCm()) / 91.44);

                break;

            default:
                System.out.println("No existe la opción elegida.");
                break;
        }

    }

    public void kmsConverter() {

        System.out.println("De kilómetros a: \n1.- metros\n2.- centímetros\n3.-yardas");
        int option = sc.nextInt();
        System.out.println("Valor a convertir");

        double toConvert = sc.nextDouble();
        switch (option) {
            case 1:

                System.out.println((toConvert * un.getKm()) * 1000);

                break;
            case 2:
                System.out.println((toConvert * un.getKm()) * 100000);

                break;
            case 3:

                System.out.println((toConvert * un.getKm()) * 1094);

                break;

            default:
                System.out.println("No existe la opción elegida.");
                break;
        }

    }

    public void ydConverter() {

        System.out.println("De yardas a: \n1.- metros\n2.- kilómetros\n3.-centímetros");
        int option = sc.nextInt();
        System.out.println("Valor a convertir");
        double toConvert = sc.nextDouble();
        switch (option) {
            case 1:

                System.out.println((toConvert * un.getYd()) / 1.094);

                break;
            case 2:
                System.out.println((toConvert * un.getYd()) / 1094);

                break;
            case 3:

                System.out.println((toConvert * un.getYd()) * 91.44);

                break;

            default:
                System.out.println("No existe la opción elegida.");
                break;
        }

    }

    public void mConverter() {

        System.out.println("De metros a: \n1.- centímetros\n2.- kilómetros\n3.-yardas");
        int option = sc.nextInt();
        System.out.println("Valor a convertir");

        double toConvert = sc.nextDouble();
        switch (option) {
            case 1:

                System.out.println((toConvert * un.getM()) / 100);

                break;
            case 2:
                System.out.println((toConvert * un.getM()) / 1000);

                break;
            case 3:

                System.out.println((toConvert * un.getM()) / 91.44);

                break;

            default:
                System.out.println("No existe la opción elegida.");
                break;
        }

    }

}
