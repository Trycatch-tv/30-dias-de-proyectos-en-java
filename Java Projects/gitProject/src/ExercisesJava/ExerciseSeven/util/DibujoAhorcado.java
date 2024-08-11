package ExercisesJava.ExerciseSeven.util;

public class DibujoAhorcado {

    public void DibujoAhorcado(int numeroError) {

        switch (numeroError) {

            case 0:

                System.out.println("");
                break;
            case 1:

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("_________");

                break;
            case 2:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("_________");

                break;
            case 3:
                System.out.println("------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("_________");
                break;
            case 4:

                System.out.println("------");
                System.out.println("|   |");
                System.out.println("|   o");
                System.out.println("|");
                System.out.println("|");
                System.out.println("_________");

                break;
            case 5:
                System.out.println("------");
                System.out.println("|   |");
                System.out.println("|   o");
                System.out.println("|  /|");
                System.out.println("|");
                System.out.println("_________");

                break;
            case 6:

                System.out.println("------");
                System.out.println("|   |");
                System.out.println("|   o");
                System.out.println("|  /|\\");
                System.out.println("|   ");
                System.out.println("_________");
                break;
            case 7:
                System.out.println("------");
                System.out.println("|   |");
                System.out.println("|   o");
                System.out.println("|  /|\\");
                System.out.println("|  /");
                System.out.println("_________");
                break;

            case 8:
                System.out.println("------");
                System.out.println("|   |");
                System.out.println("|   o");
                System.out.println("|  /|\\");
                System.out.println("|  / \\");
                System.out.println("_________");

                break;

            default:
            
                break;
        }

    }

}
