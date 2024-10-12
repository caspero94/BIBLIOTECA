/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;//Hemos importado la libreria Scanner

/**
 *
 * @author jdavi
 */

/*ENTRADA DE DATOS*/

public class _5Datos {
            public static void main(String[] args) {
        // Función principal, todo el código empezará desde el main
        
        /*El uso de la clase Scanner es una de las mejores maneras de ingresar datos por teclado en Java.
        Utilizada para obtener la entrada de los tipos primitivos como int, double etc*/
        
        /*El operador new permite a los desarrolladores crear una instancia de un tipo de objeto definido por el usuario o de 
        uno de los tipos de objeto integrados que tiene un función constructora. Y la palabra in significa entrada de datos*/
        
        Scanner entrada = new Scanner(System.in);
        
        /*Para establecer que la varianble es constante se debe pone al inicio la palabra final*/
        
        final int numero = 150;
       
        System.out.println("El numero es: "+numero);//sale por pantalla El numero es: + el valor de la variable
}
}
