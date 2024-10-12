/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1Condicionales;  // Declaración del paquete donde se encuentra la clase.

import java.util.Scanner;  // Importa la clase Scanner desde el paquete java.util, para poder leer la entrada del usuario.

public class Dia_semanabis {  // Definición de la clase principal "Dia_semana".

   public static void main(String[] args) {  // El método main es el punto de entrada del programa.
      Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer datos desde el teclado.
      
      // Muestra un mensaje solicitando al usuario que introduzca un número entre 1 y 7.
      System.out.print("Introduzca un número de 1 a 7: ");  // System.out.print imprime el mensaje sin salto de línea.
      
      int dia = sc.nextInt();  // Lee un número entero ingresado por el usuario y lo almacena en la variable 'dia'.
      
      // Switch es una estructura condicional que selecciona una acción dependiendo del valor de la variable 'dia'.
      switch (dia) {  // El switch evalúa el valor de la variable 'dia' (el número ingresado por el usuario).
         
         // Si el valor de 'dia' es 1, imprime "lunes".
         case 1 -> System.out.println("lunes");  // Lunes corresponde al valor 1.
         
         // Si el valor de 'dia' es 2, imprime "martes".
         case 2 -> System.out.println("martes");  // Martes corresponde al valor 2.
         
         // Si el valor de 'dia' es 3, imprime "miércoles".
         case 3 -> System.out.println("miércoles");  // Miércoles corresponde al valor 3.
         
         // Si el valor de 'dia' es 4, imprime "jueves".
         case 4 -> System.out.println("jueves");  // Jueves corresponde al valor 4.
         
         // Si el valor de 'dia' es 5, imprime "viernes".
         case 5 -> System.out.println("viernes");  // Viernes corresponde al valor 5.
         
         // Si el valor de 'dia' es 6, imprime "sábado".
         case 6 -> System.out.println("sábado");  // Sábado corresponde al valor 6.
         
         // Si el valor de 'dia' es 7, imprime "domingo".
         case 7 -> System.out.println("domingo");  // Domingo corresponde al valor 7.
         
         // No se incluye un bloque default porque se asume que el usuario ingresará un número entre 1 y 7.
      }
   }
}
