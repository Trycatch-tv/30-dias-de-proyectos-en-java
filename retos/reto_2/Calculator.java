import java.util.Scanner;

class Calculator {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Por favor ingresar un operador: +, -, * o /");
      char var2 = var1.next().charAt(0);
      System.out.println("Por favor ingresar el numerador");
      Double var3 = var1.nextDouble();
      System.out.println("Por favor ingresar el denominador");
      Double var4 = var1.nextDouble();
      Double var5 = 0.0;
      switch (var2) {
         case '+' -> {
             var5 = var3 + var4;
             System.out.println("El resultado de la suma es: " + var5);
           }
         case '-' -> {
             var5 = var3 - var4;
             System.err.println("El resultado de la resta es: " + var5);
           }
         case '*' -> {
             var5 = var3 * var4;
             System.out.println("El resultado de la multiplicacion es: " + var5);
           }
         case '/' -> {
            if (var4 != 0) {
               var5 = var3 / var4;
               System.out.println("El resultado de la division es: " + var5);
           } else {
               System.out.println("No se puede dividir entre cero.");
           }
           break;
         }
         default -> var1.close();
      }
   }
}