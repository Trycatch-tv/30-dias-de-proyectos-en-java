import java.util.Scanner;

class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.println("Ingrese por favor la frase: ");
        cadena = scan.nextLine().toLowerCase(); //pasa la cadena todo a minuscula

        cadena = cadena.replaceAll("[^A-Za-z0-9]+", ""); //elimina espacio y caracteres
        StringBuilder stringBuilder = new StringBuilder(cadena); // invierte el sting
		String invertida = stringBuilder.reverse().toString().toLowerCase(); // lo convertimos a cadena con toString porque 
        System.out.println(cadena);
        System.out.println(invertida);

        if (cadena.equals(invertida)){
            System.out.println("Palindromo");
        } else {
            System.out.println("No es Palindromo");
        }
    }
}