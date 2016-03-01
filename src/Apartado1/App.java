package Apartado1;
import java.util.*;

/**
 * <h1>App</h1>
 * App es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * App es la clase que ejecuta el programa principal de
 * de la clase Serpientes.java del paquete Apartado1.
 * 
 * Crear un ArrayList y añadir una serie de objetos Serpientes 
 * a la lista. A continuación, usar el método get() para recorrer la lista 
 * e invocar a reptar() para cada Serpiente.
 * 
 * 
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-13
 */
public class App {
  public static void main(String arg []) {
    final int SERPIENTES_A_REPTAR = 15;
    ArrayList<Serpientes> aLSerpientes = new ArrayList<Serpientes>();
    for(int i = 0; i < SERPIENTES_A_REPTAR; i++){
      aLSerpientes.add(new Serpientes((i + 1)));	
    }
    for(int i = 0; i < SERPIENTES_A_REPTAR; i++){
      aLSerpientes.get(i).reptar();
    }
  }
 }
