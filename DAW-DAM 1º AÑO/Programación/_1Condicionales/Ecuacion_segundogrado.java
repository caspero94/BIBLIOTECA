/*Los operadores condicionales en Java son aquellos que evalúan dos expresiones booleanas.
Operador	Descripción
&&	        Operador condicional AND
||	        Operador condicional OR
?:	        Operador Ternario
instanceof	Operador instanceof

https://www.manualweb.net/java/operadores-condicionales-java/

*/

package _1Condicionales;

import java.util.*;/*El astericos en los java import tiene la funcionalidad de hacer visible todos los miembros de una coleccion
sin tener que usar el nombre del identificador completo*/

public class Ecuacion_segundogrado {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
/*Double es un tipo de dato en java que se utiliza para almacenar valores de punto flotante*/
      double a, b, c; 
      double x1, x2, d; 

      System.out.print("Introduzca primer coeficiente (a): ");//System.out.print Imprimir por pantalla
      a = sc.nextDouble();/*nextDouble para leer un dato double*/
      System.out.print("Introduzca segundo coeficiente (b): ");
      b = sc.nextDouble();
      System.out.print("Introduzca tercer coeficiente (c): ");
      c = sc.nextDouble();

      d = (b * b - 4 * a * c);
      if (d < 0) { 
         System.out.println("No existen soluciones reales");
      } else {
         if (a == 0) {//si a es igual a 0
            System.out.println("No es una ecuación de segundo grado");
         } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a); //La  función Math.sqrt() retorna la raíz cuadrada de un número, que es
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
         }
      }
   }
}

