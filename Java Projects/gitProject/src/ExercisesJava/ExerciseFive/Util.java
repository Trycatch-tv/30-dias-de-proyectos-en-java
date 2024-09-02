package ExercisesJava.ExerciseFive;
import java.util.Arrays;
import java.util.Scanner;

public class Util {

    Scanner sc = new Scanner(System.in);

    public String pedirPalabra() {

        System.out.println("Ingrese la palabra a verificar: ");
        String palabraRecibida = sc.nextLine();
        return palabraRecibida;
    }

    public boolean palindromeVerificator() {
        String palabraArr = pedirPalabra();
        char[] caracteres = new char[palabraArr.length()];
        char[] caracteresInvertidos = new char[palabraArr.length()];
        for (int i = 0; i < palabraArr.length(); i++) {
            caracteres[i] = palabraArr.charAt(i);   
        }

        for (int i = palabraArr.length()-1; i>=0; i--) {
            caracteresInvertidos[palabraArr.length() - 1 - i] = palabraArr.charAt(i);   

        }

        return Arrays.equals(caracteres, caracteresInvertidos);

    }

}
