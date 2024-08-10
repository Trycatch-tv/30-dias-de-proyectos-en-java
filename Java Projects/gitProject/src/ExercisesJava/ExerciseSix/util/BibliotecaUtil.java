package ExercisesJava.ExerciseSix.util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import ExercisesJava.ExerciseSix.Libro;
import ExercisesJava.ExerciseSix.CSVReader;

public class BibliotecaUtil {

    Scanner sc = new Scanner(System.in);

    Libro[] dataSet = CSVReader.read("C:\\Users\\Asus\\Downloads\\libros.csv");

    public ArrayList<Libro> lista = new ArrayList<>();

    public BibliotecaUtil() {

        for (Libro libro : dataSet) {
            lista.add(libro);
        }

    }

    public void menuBiblioteca() {

    }

    public void aniadirLibro() {

        System.out.println("Ingrese autor, nombre y año de estreno respectivamente");

        String autor = sc.nextLine();
        String nombre = sc.nextLine();
        Integer anio = sc.nextInt();

        lista.add(new Libro(autor, nombre, anio));

    }

    public void eliminarLibro() {

        System.out.println("Ingrese el número de libro que quiere eliminar: ");

        int index = sc.nextInt();

        lista.remove(index);

    }

    public void buscarLibros() {

        System.out.println("Elija parámetro para buscar: \n1.- Autor\n2.-Libro \n3.- Año de estreno");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                System.out.println("Ingrese nombre del autor: ");
                String parametroAutor = sc.nextLine();
                System.out.println(
                    lista.stream().filter(x -> x.autor().contains(parametroAutor)).collect(Collectors.toList()));
                break;

            case 2:
                System.out.println("Ingrese nombre del libro: ");
                String parametroLibro = sc.nextLine();
                System.out.println(
                        lista.stream().filter(x -> x.titulo().contains(parametroLibro)).collect(Collectors.toList()));

                break;

            case 3:
                System.out.println("Ingrese año del libro: ");
                int parametroAnio = sc.nextInt();
                System.out.println(
                        lista.stream().filter(x -> x.anioPubliacion() == parametroAnio).collect(Collectors.toList()));

                break;

            default:

                System.out.println("No existe tal opción");
                break;
        }

    }

}
