
/**
 *
 * @author jdavi
 */

//PARA COMENTAR LÍNEAS USAMOS //
/*PARA COMENTAR VARIAS LÍNEAS USAMOS */

package _1curso_java; //Creamos paquete de java y lo nombramos con _1curso_java//
 /*Un paquete es una forma de organizar las clases en Java. En este caso, creaste el paquete llamado _1curso_java. 
Los paquetes también evitan conflictos de nombres cuando tienes muchas clases.*/


public class HolaMundo {
    //public: Es un modificador de acceso que indica que esta clase será accesible desde cualquier parte del programa.
    //class: Define una clase en Java. Todo el código de Java está contenido en clases.
/**
¿Qué es una clase?
En programación orientada a objetos, una clase es una plantilla o modelo a partir del cual se crean objetos. 
Los objetos son instancias de clases. La clase define los atributos (datos) y métodos (comportamientos) que esos objetos tendrán.
Atributos: Son las propiedades o características que describen a los objetos (como el color, el tamaño, etc.).
Métodos: Son las acciones o comportamientos que los objetos pueden realizar (como caminar, correr, ladrar, etc.).
*/
    
    //HolaMundo: Es el nombre de la clase. El nombre de la clase debe coincidir con el nombre del archivo si el archivo es público 
    //(por ejemplo, HolaMundo.java
    
    public static void main(String[] args) {
        // Función principal, todo el código empezará desde el main
        //static: Significa que este método pertenece a la clase, no a una instancia de la clase, por lo que puede ser ejecutado 
        //sin crear un objeto de la clase.
        System.out.println("Hola Mundo");
    }
}

