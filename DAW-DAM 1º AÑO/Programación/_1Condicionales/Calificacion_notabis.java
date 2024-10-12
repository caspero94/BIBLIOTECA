/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package _1Condicionales;  // Declaración del paquete, que agrupa clases relacionadas en Java.

// Importa la clase Scanner, que permite la entrada de datos desde el teclado.
import java.util.Scanner;

public class Calificacion_notabis {  // Definición de la clase principal "Calificacion_nota", donde está el código.

   public static void main(String[] args) {  // Método principal, donde comienza la ejecución del programa.
      Scanner sc = new Scanner(System.in);  // Crea una instancia de la clase Scanner para leer datos desde el teclado.
      
      // Muestra un mensaje en la consola pidiendo al usuario que introduzca una nota.
      System.out.print("Introduzca una nota: ");

      // Lee un número entero ingresado por el usuario (la nota) y lo asigna a la variable 'nota'.
      int nota = sc.nextInt();  /* Mediante la instrucción sc.nextInt(), el objeto Scanner accede al buffer de entrada
                                   y obtiene un valor de tipo entero que se asigna a la variable 'nota'. Es decir que lee el valor ingresado */

      /* Estructura condicional if-else que evalúa el valor de la variable 'nota' para determinar su calificación.
         'if' es una estructura condicional que ejecuta un bloque de código solo si la condición especificada es verdadera. */
      if (0 <= nota && nota < 5) {  // Si la nota está entre 0 (incluido) y 4 (inclusive), muestra "Insuficiente".
         System.out.println("Insuficiente");
         
      } else if (nota == 5) {  // Si la nota es exactamente 5, muestra "Suficiente".
         System.out.println("Suficiente");
         
      } else if (nota == 6) {  // Si la nota es exactamente 6, muestra "Bien".
         System.out.println("Bien");
         
      } else if (nota == 7 || nota == 8) {  // Si la nota es 7 u 8, muestra "Notable".
         System.out.println("Notable");
         
      } else if (nota == 9 || nota == 10) {  // Si la nota es 9 o 10, muestra "Sobresaliente".
         System.out.println("Sobresaliente");
         
      } else {  // Si ninguna de las condiciones anteriores se cumple (nota fuera de rango), muestra "Error: nota no válida".
         System.out.println("Error: nota no válida");
      }
   }
}
