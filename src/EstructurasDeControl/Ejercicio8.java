package EstructurasDeControl;

import java.util.Scanner;


/*

 */



public class Ejercicio8 {

   
    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in);
      System.out.print("Ingresa el tiempo en minutos: ");
      int minutos = leer.nextInt();

      int dias = minutos / 1440;
      int horas = (minutos % 1440) / 60;

      System.out.println(minutos + " minutos son " + dias + " día(s) y " + horas + " hora(s).");
   }
}

    
    

