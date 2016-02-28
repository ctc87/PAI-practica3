package Apartado3;
import java.util.*;
import Apartado1.Serpientes;

/**
 * <h1>App</h1>
 * App es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * App es la clase que ejecuta el programa principal de
 * de la clase Serpientes.java del paquete Apartado1.<br/>
 * <br/>
 * Tomar la clase Serpiente y la pone en un Mapa, asociando el nombre
 * de la Serpiente como una String (la clave) con cada Serpiente (el valor) que 
 * se introduzca en la tabla. Conseguir un iterador para el keySet() y utilizarlo
 * para recorrer el Mapa, buscando la Serpiente para cada clave, imprimiendo la 
 * clave y ordenando a la Serpiente reptar().
 * 
 * @see 	Serpientes
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-13
 */
public class App {
  public static void main(String arg []) {
    final int SERPIENTES_A_REPTAR = 15;
    Map<String, Serpientes> mapSerpientes = new TreeMap<String, Serpientes>();

    for(int i = 0; i < SERPIENTES_A_REPTAR; i++){
      mapSerpientes.put("Serpiente" + (i + 1), new Serpientes(i + 1));
    }
    
    Iterator<String> mapSerpientesIt = mapSerpientes.keySet().iterator();
    
    while(mapSerpientesIt.hasNext()) {
      String key = mapSerpientesIt.next();
      System.out.print("Clave de de la serpiente " + key + ". ");
      mapSerpientes.get(key).reptar();
    }
  }
}
