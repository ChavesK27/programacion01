
import java.util.Scanner;


public class prob_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("ingrese el primer numero: ");
        byte num1 = scanner.nextByte();


        System.out.print("ingrese el segundo valor: ");
        byte num2 = scanner.nextByte();

        if(((num1/num2) * num2 ) == num1){
            System.out.println("Numero divisible ");
        }else {
            System.out.println("Numero no divisible ");

        }

    }
}
