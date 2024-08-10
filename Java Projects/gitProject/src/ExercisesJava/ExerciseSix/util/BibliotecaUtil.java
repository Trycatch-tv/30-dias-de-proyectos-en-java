package ExercisesJava.ExerciseSix.util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ExercisesJava.ExerciseSix.Libro;
import ExercisesJava.ExerciseSix.CSVReader;

public class BibliotecaUtil {

    Scanner sc = new Scanner(System.in);

    Libro[] dataSet = CSVReader.read("C:\\Users\\Asus\\Downloads\\libros.csv");

    ArrayList<Libro> lista;
    public void llenarBiblioteca() {
        for (Libro libro : dataSet) {
            lista.add(libro);
        }


    }
    

    public void aniadirLibro(){

        System.out.println("Ingrese autor, nombre y año de estreno respectivamente");

        String autor= sc.nextLine();
        String nombre = sc.nextLine();
        Integer anio = sc.nextInt();

        lista.add(new Libro(autor, nombre, anio));

    }

    public void eliminarLibro(){

        System.out.println("Ingrese el número de libro que quiere eliminar: ");

        int index = sc.nextInt();

        lista.remove(index);

    }

    public void buscarLibros() { 

        System.out.println("Elija parámetro para buscar: \n1.- Autor\n2.-Libro \3.- Año de estreno");

        int option = sc.nextInt();

        switch (option) {
            case 1:
            System.out.println("Ingrese nombre del autor: ");
            String parametroAutor = sc.nextLine();
            Predicate<Libro> byAutor = (x) -> x.autor().contains(parametroAutor);

            
                System.out.println(lista.stream().filter(byAutor).collect(Collectors.toList()));
                break;
        
            case 2:
                
                break;
        
            case 3:
                
                break;
        
            default:
                break;
        }

    }



}
