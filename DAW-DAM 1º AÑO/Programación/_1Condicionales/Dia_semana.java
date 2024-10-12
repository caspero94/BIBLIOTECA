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

public class Dia_semana {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduzca un número de 1 a 7: ");//System.out.print Imprimir por pantalla
      int dia = sc.nextInt();
      
      
      switch (dia) {
         case 1 -> System.out.println("lunes");
         case 2 -> System.out.println("martes");
         case 3 -> System.out.println("miércoles");
         case 4 -> System.out.println("jueves");
         case 5 -> System.out.println("viernes");
         case 6 -> System.out.println("sábado");
         case 7 -> System.out.println("domingo");
      }
   }
}