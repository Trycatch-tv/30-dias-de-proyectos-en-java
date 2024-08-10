package ExercisesJava.ExerciseSix;

import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {      
        
        
        Libro[] dataSet =CSVReader.read("C:\\Users\\Asus\\Downloads\\libros.csv");

        ArrayList<Libro> lista= new ArrayList<>();

        lista.add(dataSet[0]);

        System.out.println(lista.get(0));

    }
}
