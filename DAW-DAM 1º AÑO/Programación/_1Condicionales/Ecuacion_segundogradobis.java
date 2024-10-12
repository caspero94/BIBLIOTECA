/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1Condicionales;  // Declaración del paquete donde se encuentra la clase.

import java.util.*;  /* El asterisco en la declaración de importación hace visible todos los miembros del paquete java.util,
                        por lo que no es necesario importar cada clase específica manualmente (en este caso, Scanner). */

public class Ecuacion_segundogradobis {  // Definición de la clase principal "Ecuacion_segundogrado".

   public static void main(String[] args) {  // Método principal que inicia la ejecución del programa.
      Scanner sc = new Scanner(System.in);  // Creación del objeto Scanner para leer los datos del usuario.

      /* Double es un tipo de dato en Java que se utiliza para almacenar valores de punto flotante (decimales).
         En este caso, se declaran las variables para los coeficientes a, b, y c, así como para las soluciones x1, x2, y el discriminante d. */
      double a, b, c;  // Coeficientes de la ecuación de segundo grado.
      double x1, x2, d;  // x1 y x2 serán las soluciones, y d es el discriminante de la ecuación.

      // Solicita al usuario el primer coeficiente (a) e imprime el mensaje en la consola.
      System.out.print("Introduzca primer coeficiente (a): ");
      a = sc.nextDouble();  // nextDouble() lee un valor de punto flotante ingresado por el usuario y lo asigna a la variable 'a'.
      
      // Solicita el segundo coeficiente (b).
      System.out.print("Introduzca segundo coeficiente (b): ");
      b = sc.nextDouble();  // nextDouble() lee el valor de 'b'.
      
      // Solicita el tercer coeficiente (c).
      System.out.print("Introduzca tercer coeficiente (c): ");
      c = sc.nextDouble();  // nextDouble() lee el valor de 'c'.

      // Calcula el discriminante de la ecuación cuadrática: d = b^2 - 4ac
      d = (b * b - 4 * a * c);

      // Si el discriminante es menor que 0, no hay soluciones reales.
      if (d < 0) { 
         System.out.println("No existen soluciones reales");  // Imprime un mensaje si no hay soluciones reales.
      } else {  // Si el discriminante es mayor o igual a 0, hay soluciones reales.
         
         // Si 'a' es 0, no es una ecuación de segundo grado.
         if (a == 0) {
            System.out.println("No es una ecuación de segundo grado");  // Si 'a' es 0, la ecuación no es cuadrática.
         } else {
            // Si el discriminante es mayor o igual a 0, se calculan las dos soluciones (x1 y x2).
            // La fórmula cuadrática es: x1 = (-b + √d) / 2a y x2 = (-b - √d) / 2a
            x1 = (-b + Math.sqrt(d)) / (2 * a);  // Calcula la primera solución usando la fórmula cuadrática.
            x2 = (-b - Math.sqrt(d)) / (2 * a);  // Calcula la segunda solución usando la fórmula cuadrática.

            // Imprime las soluciones.
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
         }
      }
   }
}
