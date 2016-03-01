package Apartado4;

/**
 * <h1>App</h1>
 * App es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * App es la clase que ejecuta el programa principal de la clase 
 * NumOcurrencias.java del paquete Apartado4.<br/>
 * <br/>
 * Controla que se reciban parámetros de entrada, crea un objeto de la
 * clase NumOcurrencias con el primer argumento pasado a la función
 * main. Por último muestra el resultado de ejecutar NumOcurrencias sobre
 * el archivo llamando al método apropiado.
 * @see NumOcurrencias
 * @see	IllegalArgumentException
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-13
 */
public class App {

	public static void main(String args[]) {
	    if(args.length != 1) {
	        throw new IllegalArgumentException("Exactamente un parámetro requerido");
	    }	    
		NumOcurrencias numOcurrencias = new NumOcurrencias(args[0]);
		numOcurrencias.imprimirResultados();
	}
	
}
