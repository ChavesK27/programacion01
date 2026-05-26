import java.util.Scanner;


public class prob_01 {

    public static void main(String args[]){

        linea(50, '=');
       System.out.println("U.T.N - Sede del Pacifico");
       System.out.println("ITI-221 - Programacion");
       linea(50, '-');


       //Lectura de un entero pequeño
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un valor entero: ");
       byte num = scanner.nextByte();


       if(((num/2) * 2 ) == num){
            System.out.println("Numero par");
       }else {
           System.out.println("Numero impar");

       }


   }//cierre del main


    //funcion linea para crear separadores
    static void linea (int largo, char exp) {
        for (int i = 0; i < largo; i++) {
            System.out.print(exp);
        }
        System.out.println();

    }

}//ciere de la clase


