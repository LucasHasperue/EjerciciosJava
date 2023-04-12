
package Introduccion;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
         String nombre = leer.next();
         
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        
        
        System.out.println("Hola soy " + nombre + " Y tengo " + edad + " aÃ±os");
    
        
    }
    
}
