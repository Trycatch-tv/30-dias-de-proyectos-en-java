package ExercisesJava.ExerciseTwop;
import java.util.Scanner;
public class ExerciseTwo {
    

    
    //Calculadora en Java
    public static void main(String[] args) {
        Util util = new Util();
        Scanner sc = new Scanner(System.in);
                
        
        switch (util.menuOptions()) {
            case 1:
                System.out.println(util.sumar());
                break;
            case 2:

            System.out.println(util.restar());
                break;
            case 3:
                System.out.println(util.multiplicar());
                break;
            case 4:
                System.out.println(util.dividir());
                break;
            
            default:
                break;
        }

        sc.close();

        

    }

    
}
