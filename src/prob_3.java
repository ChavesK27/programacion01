public class prob_3 {

    public static void main(String[] args) {
        //uso de subrutinas
        saludar();
        saludar("Kevin ");

        System.out.println("La suma es " + sumar((byte) 3, (byte) 5));
        System.out.println();//espacios
        System.out.println("La division es: " + dividir(8f, 3f));
        System.out.println();//espacios
        System.out.println("El numero es mayor : " + iguales(3,6));

        //Declarar vector
        int vector[] = {5, 1, 3, 7, 9, 2, 4, 8, 6};
        impVector1(vector);
        System.out.println("--------------------------");
        ordBurbuja(vector);//ordenamiento del vector
        impvector2(vector);//imprime el vetor ordenado



    }

    //Declaracion de subrutinas
    static void saludar() {
        System.out.println("hola a todos.. ");


    }

    static void saludar(String alguien) {
        System.out.println("hola a " + alguien + "Como estas..?");
    }

    static byte sumar(byte num1, byte num2) {
        return (byte) (num1 + num2);
    }

    static float dividir(float num1, float num2){
        return num1/num2;


    }
    static boolean iguales(int num1, int num2){
        return num1 == num2;
    }
    static boolean igualAntigua(int num1, int num2){
        boolean resu = false;
        if(num1 == num2){
            resu = true;
        }else{
            resu = false;

        }
        return resu;
    }
    static void impVector1(int vc[]){
        for(int i=0; i<vc.length; i++){
            System.out.print("[" + vc[i] + "]");
        }
        System.out.println(); //espacio para vectores
    }

    static void impvector2(int vc[]) {
        for (int number : vc) {
            System.out.print("[" + number + "]");
        }
        System.out.println();
    }
    static void ordBurbuja(int vc[]){
        int aux;
        for(int i=0; i<vc.length - 1; i++){
            if(vc[i] > vc[i+1]){
                aux = vc[i];
                vc[i] = vc[i+1];
                vc[i+1] = aux;
                i = -1;


            }
        }
        }
    }




