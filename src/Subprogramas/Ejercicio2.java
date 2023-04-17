/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package Subprogramas;

import java.util.Scanner;



public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        boolean seguirMostrando = true;
        
        while (seguirMostrando) {
            System.out.print("Ingresa el nombre de la persona: ");
            nombre = leer.nextLine();
            System.out.print("Ingresa la edad de " + nombre + ": ");
            edad = leer.nextInt();
            leer.nextLine();
            System.out.println(nombre + " tiene " + edad + " años.");
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.\n");
            } else {
                System.out.println(nombre + " es menor de edad.\n");
            }
            
            System.out.print("¿Quieres seguir mostrando personas? (Sí/No): ");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                seguirMostrando = false;
            }
        }
        
        System.out.println("Fin del programa.");
        leer.close();
    }

}