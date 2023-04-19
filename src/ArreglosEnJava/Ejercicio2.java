/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package ArreglosEnJava;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        int numero;
        int cont = 0;

        System.out.println("Ingrese el tamaño del vector:");
        N = leer.nextInt();

        int vector[] = new int[N];

        System.out.println("Ingrese el numero a buscar en el vector:");
        numero = leer.nextInt();

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println("[" + vector[i] + "]");
        }

        for (int i = 0; i < N; i++) {
            if (numero == vector[i]) {
                cont = cont + 1;
                System.out.println("El numero se encuentra en la posicion " + i);
            }

        }

        System.out.println("El numero se repite " + cont + " veces");

    }
}
