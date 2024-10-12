/*@author jdavi*/

/*VARIABLES PRIMITIVAS
Una Variable es un espacio de memoria que almacena un valor, es decir como si tuvieramos una caja y guardamos algo*/


public class _0variable_0_enterobis {
    public static void main(String[] args) {
        // Función principal, todo el código empezará desde el main
        
        // 1. Variable tipo byte (valor de -128 a 127)
        byte byteEntero = 1;  // También podemos hacerlo byte entero; entero = 1;
        System.out.println("Variable tipo byte: " + byteEntero);

        // 2. Variable tipo short (valor de -32,768 a 32,767)
        short shortEntero = 11000;  // También podemos hacerlo short entero; entero = 11000;
        System.out.println("Variable tipo short: " + shortEntero);

        // 3. Variable tipo int (valor de -2,147,483,648 a 2,147,483,647)
        int intEntero = 2000000000;  // También podemos hacerlo int entero; entero = 2000000000;
        System.out.println("Variable tipo int: " + intEntero);

        // 4. Variable tipo long (valor de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
        long longEntero = 2000000000000000000L;  // Añadir "L" para indicar que es un long
        System.out.println("Variable tipo long: " + longEntero);

        // OJO: solo se pueden poner números enteros, no decimales.
    }
}

/*
Explicación breve:
byte: Variable para almacenar números enteros pequeños, entre -128 y 127.

short: Variable para almacenar enteros un poco más grandes, entre -32,768 y 32,767.

int: Variable para enteros grandes, la más usada. Puede almacenar valores entre -2,147,483,648 y 2,147,483,647.

long: Variable para enteros extremadamente grandes, entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807. 

Para los valores de long, se añade una L al final del número para indicar que es un long.
*/