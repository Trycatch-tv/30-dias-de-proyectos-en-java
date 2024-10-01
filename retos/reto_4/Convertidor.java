
import java.util.Scanner;

class Convertidor {
    public static void main(String[] args){
        float input = 0;
        String medida = "";
        float resultado = 0;
        String medida_2 = "";

        // Crear instancia de Scanner para capturar la entrada del usuario
        Scanner scan = new Scanner(System.in);  

        // Capturar el valor decimal a convertir
        System.out.println("Ingrese por favor el valor que desea convertir: ");
        input = scan.nextFloat();
        scan.nextLine();

        while (true) {
            // Capturar el tipo de medida original
            System.out.println("Ingrese por favor la unidad original: km, m, cm");
            medida = scan.nextLine();
            if (medida.equals("km") || medida.equals("m") || medida.equals("cm")) {
                break;
            } else {
                System.out.println("La unidad debe ser: km, m o cm.");
            }
        }

        while (true) {
            // Capturar el tipo de medida a convertir
            System.out.println("Ingrese por favor la unidad a convertir: km, m, cm");
            medida_2 = scan.nextLine();
            if (medida_2.equals("km") || medida_2.equals("m") || medida_2.equals("cm")) {
                break;
            } else {
                System.out.println("La unidad debe ser: km, m o cm.");
            }
        }
            switch (medida) {
                case "km":
                    if (medida_2.equals("m")){
                        resultado = input*1000;
                    } else if (medida_2.equals("cm")) {
                        resultado = input*100000;
                    }             
                    break;
                case "m":
                    if (medida_2.equals("km")){
                        resultado = input/1000;
                    } else if (medida_2.equals("cm")) {
                        resultado = input*100;
                    }
                    break;
                case "cm":
                    if (medida_2.equals("km")) {
                        resultado = input/100000;
                    } else if (medida_2.equals("m")) {
                        resultado = input/100;
                        
                    }
                    break;
            }
    System.out.println("El valor convertido es: " + resultado + medida_2);
    }
}