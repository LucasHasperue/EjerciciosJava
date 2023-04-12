/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.

 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor limite positivo");

        int numLim = leer.nextInt();

        int suma = 0;

        while (suma <= numLim) {
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números ingresados superó el límite de " + numLim);
    }
}
