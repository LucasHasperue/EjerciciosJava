/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que
, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa 
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.
 */
package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean booleano = true;

        do {

            System.out.println("Ingresar dos numeros enteros positivos");

            int n1 = leer.nextInt();

            int n2 = leer.nextInt();

            System.out.println("Ingrese 1 para sumar");

            System.out.println("Ingrese 2 para restar");

            System.out.println("Ingrese 3 para multiplicar");

            System.out.println("Ingrese 4 para dividir");

            System.out.println("Ingrese 5 para salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los dos numeros es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Estas seguro que deseas salir s/n");

                    String conf = leer.next();

                    if (conf.equalsIgnoreCase("s")) {
                        booleano = false;
                    } 
            }
        } while (booleano);
    }

}
