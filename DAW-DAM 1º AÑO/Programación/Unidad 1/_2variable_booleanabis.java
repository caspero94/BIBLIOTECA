/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _1curso_java;

/**
 *
 * @author jdavi
 */

//VARIABLES PRIMITIVAS

// Una variable es un espacio de memoria que almacena un valor. En este caso, una variable booleana almacena un valor de decisión: true o false.

public class _2variable_booleanabis {
    
    public static void main(String[] args) {
        // Función principal, todo el código empezará desde el main
        
        /* Variable tipo boolean: Este tipo de variable almacena solo dos valores posibles: true (verdadero) o false (falso).
         * Se usa en decisiones o comparaciones lógicas.
         */
        
        boolean decision = true;  // Declaración de una variable booleana inicializada a true
        System.out.println("La decisión es: " + decision);  // Salida: La decisión es: true
        
        // Ejemplo usando una comparación para asignar un valor booleano
        int a = 5;
        int b = 10;
        boolean esMayor = a > b;  // Aquí se evalúa si a es mayor que b (esto dará false)
        System.out.println("¿Es 5 mayor que 10?: " + esMayor);  // Salida: false

        // Ejemplo con condicionales basados en una variable booleana
        boolean esIgual = (a == 5);  // La variable esIgual será true porque a es igual a 5
        if (esIgual) {
            System.out.println("El valor de 'a' es igual a 5.");  // Esto se imprimirá
        } else {
            System.out.println("El valor de 'a' no es igual a 5.");
        }
        
        // También podemos cambiar el valor de la variable boolean
        decision = false;
        System.out.println("La decisión ahora es: " + decision);  // Salida: La decisión ahora es: false

        // Usando el booleano en una condición más compleja
        boolean esPositivo = (a > 0) && (b > 0);  // Evalúa si tanto a como b son mayores que 0
        System.out.println("¿Son ambos números positivos?: " + esPositivo);  // Salida: true
    }
}
