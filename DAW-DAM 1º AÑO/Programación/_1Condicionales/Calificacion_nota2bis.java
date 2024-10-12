/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1Condicionales;  // Declaración del paquete donde se encuentra la clase, útil para organizar el código.

import java.util.Scanner;  // Importa la clase Scanner desde el paquete java.util, que permite leer la entrada del usuario.

public class Calificacion_nota2bis {  // Definición de la clase principal "Calificacion_nota2".

    /* Scanner es la mejor clase para recibir información a través de teclado y nos permite 
       capturar datos primitivos como int, double, String, etc. */
    
    public static void main(String[] args) {  // El método main es el punto de entrada del programa.
        Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer la entrada del usuario.
        
        // Muestra un mensaje pidiendo al usuario que introduzca una nota.
        System.out.print("Introduzca una nota: ");  // System.out.print imprime el mensaje sin un salto de línea.
        
        int nota = sc.nextInt();  // Lee un número entero (la nota) ingresada por el usuario y la almacena en la variable 'nota'.
        
        /* El switch es una estructura de control que selecciona una instrucción de múltiples vías,
           evaluando distintos casos y ejecutando la opción que coincide con el valor de la variable.
           En este caso, evalúa el valor de la variable 'nota'. Es decir es una alternativa más estructurada para condiciones */
        switch (nota) {  // El switch evalúa el valor de la variable 'nota'.
            
            // Si la nota es 0, 1, 2, 3 o 4, se imprime "Insuficiente".
            case 0, 1, 2, 3, 4 -> 
                System.out.println("Insuficiente");  // Imprime "Insuficiente" en la consola.
                
            // Si la nota es exactamente 5, se imprime "Suficiente".
            case 5 -> 
                System.out.println("Suficiente");  // Imprime "Suficiente" en la consola.
                
            // Si la nota es exactamente 6, se imprime "Bien".
            case 6 -> 
                System.out.println("Bien");  // Imprime "Bien" en la consola.
                
            // Si la nota es 7 u 8, se imprime "Notable".
            case 7, 8 -> 
                System.out.println("Notable");  // Imprime "Notable" en la consola.
                
            // Si la nota es 9 o 10, se imprime "Sobresaliente".
            case 9, 10 -> 
                System.out.println("Sobresaliente");  // Imprime "Sobresaliente" en la consola.
                
            // Si la nota no coincide con ninguno de los casos anteriores (por ejemplo, si la nota es menor que 0 o mayor que 10), 
            // se ejecuta el bloque "default" y se imprime "Error: nota no válida".
            default -> 
                System.out.println("Error: nota no válida");  // Imprime un mensaje de error si la nota no es válida.
        }
    }
}
