/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/


package  ArreglosEnJava;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        String conv;
        int vectorContador[] = new int[5];
        
        System.out.println("Ingrese el tamaño del vector");
        
        N = leer.nextInt();
        int vector[] = new int[N];
        
        System.out.println("Los numeros ingresados son: ");
        
        for (int i = 0; i < N; i++) {
            vector [i] = (int) (Math.random() *99999);
            System.out.println("[" + vector[i] + "]");
        }
        
        for (int i = 0; i < N; i++) {
            conv = String.valueOf(vector[i]);
            switch (conv.length()) {
                case 1:
                    vectorContador[0] = vectorContador[0] + 1;
                    break;
                case 2:
                    vectorContador[1] ++;
                    break;
                case 3:
                     vectorContador[2] ++;
                    break;
                case 4:
                     vectorContador[3] ++;
                    break;
                case 5:
                     vectorContador[4] ++;
                    break;
                    
            }
            
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Los numeros de " + (i+1) + " digitos." + vectorContador[i]);
        }
    }

}
