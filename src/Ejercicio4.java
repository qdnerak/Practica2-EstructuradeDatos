import java.util.Scanner;

public class Ejercicio4 {
    /*Programa que declare un vector de diez elementos enteros y pida números para rellenarlo
    hasta que se llene el vector o se introduzca un número negativo.
    Entonces se debe imprimir el vector (sólo los
    elementos introducidos).*/

    //definimos el vector de diez elementos
    int [] vectores;
    Scanner scanner;

    //metodo constructor
    public Ejercicio4() {
        vectores = new int [11];
        scanner= new Scanner (System.in);

    }

    //metodo ejecutar
    public void ejecutar(){
        //rellenamos hasta llenar el vector
            for (int i = 1; i < vectores.length; i++) {
                System.out.println("Vectores[" + i + "]:");
                int vector = scanner.nextInt();
            vectores[i]=vector;
                if(vector<0) {
                    System.out.println("¡ERROR! Introducio un numero negativo");
                    break;
                }


        }

     //imprimimos el vector (solo elementos instroducidos

    }
}
