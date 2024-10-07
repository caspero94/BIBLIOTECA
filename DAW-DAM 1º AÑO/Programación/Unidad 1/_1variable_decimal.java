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

//Variable espacio de memoria que almacena un valor, es decir como si tuvieramos una cja y guardamos algo

public class _1variable_decimal {
        public static void main(String[] args) {
        // Función principal, todo el código empezará desde el main
        
        /*Variable tipo double en este caso entero, almacena datos de números decimal o números real. Esta variable "double va del número 
        1.7E+308 a 1.7E-308. En el caso de poner un valor fuera de este rango daría error*/
      
          
        double decimal;
        decimal = 4.45;
        
        //También podemos hacerlo de esta forma "double decimal = 1";

        System.out.println("Decimal: "+decimal);//sale por pantalla Decimal + el valor de la variable
        
        
        /*Variable tipo float en este caso entero, almacena datos de números enteros. Esta variable "byte va del número 
        3.4E+38 a 3.4E-38. En el caso de poner un valor fuera de este rango daría error
        
        float decimal;
        decimal = 4.45f;//Para el float es necesario poner la f, en caso contrario da error
        
        //También podemos hacerlo de esta forma "float decimal = 11000";

        System.out.println("Deciaml: "+decimal);//sale por pantalla Decimal + el valor de la variable*/
        
        
        
        
        
        //OJO SOLO SE PUEDEN PONER NÚMEROS DECIMALES, NO SE PUEDE PONER NÚMEROS ENTEROS.
        }
        }
