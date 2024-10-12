/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

/**
 *
 * @author jdavi
 */
public class Mayor_Menor_Iguales {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int n1 = sc.nextInt();
      System.out.print("Introduzca otro número: ");
      int n2 = sc.nextInt();

      if (n1 == n2) {
         System.out.println("Son iguales");
      } else {
         if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
         } else {
            System.out.println(n2 + " es mayor que " + n1);
         }
      }
   } 
}
