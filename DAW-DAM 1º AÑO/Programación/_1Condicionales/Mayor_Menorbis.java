/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1Condicionales;  // Declaración del paquete donde se encuentra la clase.

import java.util.Scanner;  // Importamos la clase Scanner desde el paquete java.util para leer la entrada del usuario.

/**
 * Clase para determinar qué número es mayor o menor entre dos números ingresados por el usuario.
 * @author jdavi
 */
public class Mayor_Menorbis {  // Definición de la clase principal "Mayor_Menor".

   public static void main(String[] args) {  // Método principal donde se ejecuta el programa.
      Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer datos del teclado.

      // Pedimos al usuario que introduzca el primer número.
      System.out.print("Introduzca un número: ");  // Imprime un mensaje solicitando al usuario que ingrese el primer número.
      int n1 = sc.nextInt();  // Lee el primer número ingresado por el usuario y lo asigna a la variable 'n1'.

      // Pedimos al usuario que introduzca el segundo número.
      System.out.print("Introduzca otro número: ");  // Imprime un mensaje solicitando al usuario que ingrese el segundo número.
      int n2 = sc.nextInt();  // Lee el segundo número ingresado por el usuario y lo asigna a la variable 'n2'.

      // Comparamos los dos números ingresados.
      if (n1 > n2) {  // Si el primer número 'n1' es mayor que el segundo número 'n2'.
         System.out.println(n1 + " es mayor que " + n2);  // Imprime que 'n1' es mayor que 'n2'.
      } else {  // Si el primer número 'n1' no es mayor que 'n2', entonces 'n2' es mayor o igual a 'n1'.
         System.out.println(n2 + " es mayor que " + n1);  // Imprime que 'n2' es mayor que 'n1'.
      }
   }
}
