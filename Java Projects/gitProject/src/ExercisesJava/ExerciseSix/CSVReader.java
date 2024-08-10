package ExercisesJava.ExerciseSix;

import java.io.BufferedReader;
import java.io.FileReader;


public class CSVReader {
	
	static Libro convert(String[] tokens) {
		Libro item = new Libro( 
				String.valueOf(tokens[0]), String.valueOf(tokens[1]), Integer.valueOf(tokens[2])
        );
			
		return item;
	}
	
	public static Libro[] read(String fileName) {

	    try (var rd = new BufferedReader(new FileReader(fileName))) {
	        // Leer la primera línea (encabezado) y descartarla
	        rd.readLine();

	        // Leer el resto de las líneas para determinar el tamaño del array
	        int size = 0;
	        while (rd.readLine() != null) {
	            size++;
	        }

	        // Crear el array de BankClient con el tamaño adecuado
	        Libro[] libros = new Libro[size];

	        // Volver a abrir el archivo para leer los datos
	        try (var rd2 = new BufferedReader(new FileReader(fileName))) {
	            rd2.readLine(); // Descartar el encabezado

	            // Leer los registros y crear los objetos BankClient
	            for (int i = 0; i < size; i++) {
	                String line = rd2.readLine();
	                String[] tokens = line.split(",");
	                Libro libro = CSVReader.convert(tokens);
	                libros[i] = libro;
	            }
	        }

	        return libros;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

}


