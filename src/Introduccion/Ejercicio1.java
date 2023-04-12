/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma

 */
package Introduccion;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n1,n2, resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer numero");
              
              n1 = teclado.nextInt();
              
        System.out.println("Ingrese el segundo numero");
              
              n2 = teclado.nextInt(); 
              
        resultado = n1 + n2;
        
        System.out.println("la suma es : "+ resultado);
              
              
        
        
                
    }
    
}
