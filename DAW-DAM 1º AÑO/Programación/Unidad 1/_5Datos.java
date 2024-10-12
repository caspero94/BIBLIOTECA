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
        
        // El uso de la clase Scanner es una de las mejores maneras de ingresar datos por teclado en Java.
        // Utilizada para obtener la entrada de los tipos primitivos como int, double, etc.
        
        // Creamos una instancia de Scanner para leer datos del usuario desde el teclado
        Scanner entrada = new Scanner(System.in);
        
        // Para establecer que una variable es constante se debe poner al inicio la palabra 'final'
        final int numeroConstante = 150;
        
        // Mostramos el valor constante en pantalla
        System.out.println("El número constante es: " + numeroConstante);
        
        // Ahora pedimos al usuario que ingrese un número entero
        System.out.print("Por favor, ingrese un número entero: ");
        int numeroUsuario = entrada.nextInt();  // Leemos un número entero
        
        // Pedimos al usuario que ingrese un número decimal
        System.out.print("Por favor, ingrese un número decimal (double): ");
        double numeroDecimal = entrada.nextDouble();  // Leemos un número decimal
        
        // Pedimos al usuario que ingrese una cadena de texto
        entrada.nextLine();  // Consumimos la nueva línea pendiente
        System.out.print("Por favor, ingrese una frase o texto: ");
        String textoUsuario = entrada.nextLine();  // Leemos una línea de texto
        
        // Mostramos los datos ingresados por el usuario
        System.out.println("El número entero ingresado es: " + numeroUsuario);
        System.out.println("El número decimal ingresado es: " + numeroDecimal);
        System.out.println("El texto ingresado es: \"" + textoUsuario + "\"");

        // Cerrar el Scanner (buena práctica)
        entrada.close();
    }
}
