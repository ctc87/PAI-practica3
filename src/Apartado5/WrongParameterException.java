package Apartado5;
import java.io.Serializable;

/**
 * <h1>WrongParameterException</h1>
 * WrongParameterException es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 *  WrongParameterException es la clase que crea una excepción de tipo checked
 *  hija de la clase Exception. Esta informa sobre un Error en los parámetros, 
 *  bastante genéricos. 
 * @author  Carlos Troyano Carmona
 * @version 1.0  
 * @since  28 de feb. de 2016 
 * @see Exception
 * @see Serializable
 */
public class WrongParameterException extends Exception {

/**
 * Constante de clase exigida en la interfaz Serializable. 
 * @see Serializable
 */
	private static final long serialVersionUID = 1L;

/**
 * Constructor con mensaje. Establece el mensaje de la Excepción llamando
 * al constructor de la clase padre Exception. 
 * @param msg
 */
	public WrongParameterException(String msg) {
		super(msg);
	}

/**
 * Constructor con mensaje. Establece el mensaje de la Excepción llamando
 * al constructor de la clase padre Exception con el mensaje pasado por párametro, 
 * más el mensaje de la excepción pasada por parámetro, además le pasa una 
 * excepción como parámetro para anidarla. 
 * @param msg String Mensaje para la excepción.
 * @param e Exception Excepción que se anida.
 */	
	public WrongParameterException(Exception e, String msg) {
		super(e.toString() + " " +  msg, e);
	}
}
