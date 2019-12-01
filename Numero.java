/*
 
 Programa que determina si un número es cero, negativo o en su caso positivo.
 */
package numero;

import java.util.Scanner;  // Se importa la librería Scanner

/**
 *
 * @author José Valentín Zarate Carreño
 * @version  01/12/2019
 */


/** Declaracion de la clase Numero
 */
public class Numero {

    
/** main 
 */
    public static void main(String[] args) { // inicio del main

        Numero n = new Numero(); // se instancia la clase
        n.DeterminarNumero(); // se llama al método DeterminarNumero.

    }  // cierre del main

    /** Metodo que determina los singos de un numero dado.
     * 
     */
    public void DeterminarNumero() { // se inicia el método

        Scanner sc = new Scanner(System.in); //Declaración del Scanner para leer el teclado

        System.out.println("ingrese numero: "); // valoes de entrada 
        float numero = sc.nextFloat(); // variable que almacena lo que lee el Scanner

        if (numero == 0) { // valida si es igual a cero
            System.out.println("Es cero "); // imprime respuesta
        } // cierre de condición 
        else if (numero > 0) { // valida si es mayor a cero
            System.out.println("Es positivo "); // imprime respuesta

        } // cierre de condición 
        else if (numero < 0) { // valida si es menor a cero
            System.out.println("Es negativo "); // imprime respuesta
        } // cierre de condición

    }  // cierre del método

} // cierre clase principal
