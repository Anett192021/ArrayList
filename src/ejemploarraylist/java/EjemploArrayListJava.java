/**
 *
 * @author annet
 */

/**
* Ejemplo de ArrayList en Java.
* En este ejemplo vamos a crear un ArrayList con tres elementos.
* Los vamos a imprimir y luego vamos a eliminar el primero e imprimir los dos restantes para comprobar que el programa lee la ArrayList
* Enpezamos definiendo nuestro Package
*/

package ejemploarraylist.java;

/**
* Vamos a importar la clase ArrayList de Java que permite almacenar datos en memoria de forma similar a los Arrays.
*/
import java.util.ArrayList;

/**
* Creamos una clase publica EjemploArrayListJava.
*/

public class EjemploArrayListJava {


/**
 * Ahora vamos a crear una clase Main para poder correrlo
*/        
    public static void main(String[] args) {

/**
* Lo siguiente que vamos a hacer es hacer la declaración de la variable que vamos a utilizar, que vamos a llamar "cadenas".     
* Para declararla utilizamos la sintaxis ArrayList<String> cadenas;
*/

        ArrayList<String> cadenas;
        
/**
* Luego declaramos la instancia de la variable cadenas. Para esto utilizamos la sintaxis siguiente:
*/        
        cadenas = new ArrayList<String>();
        
/**        
* Agregamos elementos a nuestro ArrayList.
* Para eso vamos a utilizar la siguiente sintaxis utilizando el método add y ya tenemos tres cadenas de carácteres.
*/ 
        
        cadenas.add("Hola");
        cadenas.add("Como");
        cadenas.add("Estas");

/**        
* Luego imprimimos un mensaje de los resultados del procediemiento.
*/
        
        System.out.println("Imprimiendo los tres elementos del arreglo");

/**        
* Recorremos el arraylist con la sentencia for. La condición de parada es i menor que el tamaño del arreglo usando cadenas.size}. 
* Mandamos a imprimir el resultado usando cadenas.get. 
*/

        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println("-->"+cadenas.get(i));
        }
        
        
/**        
* Ahora vamos a eliminar un elemento con la siguiente sintaxis: cadenas.remove(i)
* Donde i es el índice del elemento del Arreglo. En este caso vamos a eliminar el primer elemento.
* Y su índice es cero.
*/        

        cadenas.remove(0);
       
/**        
* imprimimos un mensaje de los resultados del procediemiento..
*/ 
 
        System.out.println("Imprimiendo los dos elementos  del arreglo que quedaron"); 

/**        
* Volvemos a recorrer la Arraylist para ver como se ve la salida con los elementos completos y los elementos que quedaron.
*/ 

        for (int i = 0; i < cadenas.size(); i++) {
        System.out.println("--+"+cadenas.get(i));
    }
    }
    
}
