/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener 
una función para cada operación matemática y deben devolver 
sus resultados para imprimirlos en el main. 
 */
package Subprogramas;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int n1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("1 sumar");
        System.out.println("2 restar");
        System.out.println("3 multiplicar");
        System.out.println("4 dividir");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros ingresados es: " + sumar(n1, num2));
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + restar(n1, num2));
                break;
            case 3:
                System.out.println("La multiplicación de los números ingresados es: " + multiplicar(n1, num2));
                break;
            case 4:
                System.out.println("La división de los números ingresados es: " + dividir(n1, num2));
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static int dividir(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

}
