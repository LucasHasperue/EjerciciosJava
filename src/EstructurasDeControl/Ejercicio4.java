/*
Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra que empiece con la letra A");

        String palabra = leer.next();

        String letra = palabra.substring(0, 1);

        System.out.println(letra);
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }
}