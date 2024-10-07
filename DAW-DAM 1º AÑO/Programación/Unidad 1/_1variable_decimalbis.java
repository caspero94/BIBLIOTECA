package _1curso_java;

public class _1variable_decimalbis {
    public static void main(String[] args) {
        
        // 1. Variable tipo double (números decimales de doble precisión)
        // El tipo double es el más utilizado para trabajar con decimales en Java. Puede almacenar números con decimales muy grandes.
        double decimalDouble;
        decimalDouble = 4.45;
        System.out.println("Variable tipo double: " + decimalDouble);
        
        // También puedes declararlo y asignarlo en la misma línea:
        double otroDecimalDouble = 1234567.123456789;
        System.out.println("Otro número tipo double: " + otroDecimalDouble);
        
        // 2. Variable tipo float (números decimales de precisión simple)
        // El tipo float es menos preciso que double, pero se utiliza cuando necesitamos ahorrar memoria.
        // Se debe agregar una 'f' al final del número para indicar que es un float.
        float decimalFloat;
        decimalFloat = 4.45f;
        System.out.println("Variable tipo float: " + decimalFloat);
        
        // También puedes declararlo y asignarlo en la misma línea:
        float otroDecimalFloat = 12345.6789f;
        System.out.println("Otro número tipo float: " + otroDecimalFloat);
        
        // NOTA: En general, se prefiere usar 'double' para la mayoría de los cálculos que involucran decimales
    }
}