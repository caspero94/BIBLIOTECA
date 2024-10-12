/*Los operadores condicionales en Java son aquellos que evalúan dos expresiones booleanas.
Operador	Descripción
&&	        Operador condicional AND
||	        Operador condicional OR
?:	        Operador Ternario
instanceof	Operador instanceof

https://www.manualweb.net/java/operadores-condicionales-java/
*/


package _1Condicionales;

import java.util.Scanner;

public class Calificacion_nota {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduzca una nota: ");//System.out.print Imprimir por pantalla
      
      int nota = sc.nextInt();/*Mediante la instrucción sc.nextInt() Scanner accede al buffer de entrada para obtener un 
      dato de tipo int y asignarlo a la variable exp */

      /*If condicional simple, que significa si. Con el if si se cumple la condición "true/verdad" se ejecuta la condición
      en caso contrario "false/Falso" pasaría la siguiente condicional ELSE*/
      if (0 <= nota && nota < 5) { 
         System.out.println("Insuficiente");
      /*else condicional doble */
      } else if (nota == 5) {
         System.out.println("Suficiente");
      } else if (nota == 6) {
         System.out.println("Bien");
      } else if (nota == 7 || nota == 8) { 
         System.out.println("Notable");
      } else if (nota == 9 || nota == 10) { 
         System.out.println("Sobresaliente");
      } else {
         System.out.println("Error: nota no válida");
      }
   }
}