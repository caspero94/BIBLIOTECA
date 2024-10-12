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

public class Calificacion_nota2 {
    
/* Scanner es la mejor clase para recibir información a tráves de teclado y nos permite 
    capturar datos primitivos tipo int, double, string....*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");//System.out.print Imprimir por pantalla
        int nota = sc.nextInt();
        
        /*Switch es una condicional que selecciona una instrucción de multiples vía con varios 
        que evalúa distintos casos y selecciona un opción entre varias
        */
        switch (nota) {
            case 0, 1, 2, 3, 4 ->
                System.out.println("Insuficiente");//Solicitamos imprimir por pantalla
            case 5 ->
                System.out.println("Suficiente");//Solicitamos imprimir por pantalla
            case 6 ->
                System.out.println("Bien");//Solicitamos imprimir por pantalla
            case 7, 8 ->
                System.out.println("Notable");//Solicitamos imprimir por pantalla
            case 9, 10 ->
                System.out.println("Sobresaliente");//Solicitamos imprimir por pantalla
            default ->
                System.out.println("Error: nota no válida");//Solicitamos imprimir por pantalla
        }
    }
}