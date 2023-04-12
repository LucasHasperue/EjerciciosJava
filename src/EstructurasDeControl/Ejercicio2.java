/*
Crear un programa que pida una frase y si esa frase es igual 
a “eureka” el programa pondrá un mensaje de Correcto, sino 
mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");

        String palabra = leer.next();

        if (palabra.equalsIgnoreCase("eureka")) {
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }
        
   

    }
}
