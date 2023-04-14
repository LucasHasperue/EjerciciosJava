/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio7 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("A contiuacion ingrese una frase de 5 caracteres");
        
        int cant;
        int cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        String frase,caract1, caract2, FDE;
        do {
        caract1 = "x";
        caract2 = "o";
        FDE = "&&&&&";
        frase = leer.next();
        cant = frase.length();
        if  
               ((frase.substring(0,1).equals(caract1)) && (frase.substring(4,5).equals(caract2)))
        {
            cont1 = cont1+1;
         }else {
            cont2 = cont2+1;
        }
        
        }while (!frase.equals(FDE));
        System.out.println("La cantidad de secuencias correctas es de: "+cont1);
        System.out.println("La cantidad de secuencias incorrectas es de: "+cont2);
    }
    
}
    
    

