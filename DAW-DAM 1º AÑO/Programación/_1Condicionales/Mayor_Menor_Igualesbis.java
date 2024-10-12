/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1Condicionales;  // Declaración del paquete donde se encuentra la clase.

import java.util.Scanner;  // Importamos la clase Scanner desde el paquete java.util para leer la entrada del usuario.

/**
 * Clase que determina si dos números ingresados son iguales o cuál de ellos es mayor.
 * @author jdavi
 */
public class Mayor_Menor_Igualesbis {  // Definición de la clase principal "Mayor_Menor_Iguales".
   
   public static void main(String[] args) {  // Método principal donde se ejecuta el programa.
      Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer datos desde el teclado.

      // Pedimos al usuario que introduzca el primer número.
      System.out.print("Introduzca un número: ");  // Imprime un mensaje solicitando al usuario el primer número.
      int n1 = sc.nextInt();  // Lee el primer número ingresado y lo asigna a la variable 'n1'.

      // Pedimos al usuario que introduzca el segundo número.
      System.out.print("Introduzca otro número: ");  // Imprime un mensaje solicitando al usuario el segundo número.
      int n2 = sc.nextInt();  // Lee el segundo número ingresado y lo asigna a la variable 'n2'.

      // Comparamos los dos números.
      if (n1 == n2) {  // Si ambos números son iguales.
         System.out.println("Son iguales");  // Imprime que los números son iguales.
      } else {  // Si los números no son iguales.
         if (n1 > n2) {  // Si el primer número 'n1' es mayor que el segundo número 'n2'.
            System.out.println(n1 + " es mayor que " + n2);  // Imprime que 'n1' es mayor que 'n2'.
         } else {  // Si el segundo número 'n2' es mayor que 'n1'.
            System.out.println(n2 + " es mayor que " + n1);  // Imprime que 'n2' es mayor que 'n1'.
         }
      }
   } 
}
