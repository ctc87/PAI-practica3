package Apartado5;
import java.lang.ArithmeticException;
/**
 * <h1>Log2</h1>
 * Log2 es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * Log2 es la clase que ejecuta un programa principal el cual calcula
 * el logaritmo de un número pasado por parámetro. Este es calculado con
 * el método constructor que lanza una excepción si es negativo la cual 
 * se gestiona desde el programa principal.
 * <h4>controla las excepciones<h4/>
 * 	-IllegalArgumentException -> Si se le pasa más de un parámetro.
 *  -ArrayIndexOutOfBoundsException -> Si no se le pasan parámetros.
 *  -NumberFormatException -> Si se le pasa algo que no sea un número por parámetro.
 *  -ArithmeticException -> Si el número pasado como parámetro es negativo
 * <br/>
 * El programa trata básicamente del manejo de excepciones mediante bloques try catch
 * o con la palabra reservada throw.
 * @see IllegalArgumentException
 * @see	ArrayIndexOutOfBoundsException
 * @see	NumberFormatException
 * @see ArithmeticException
 * @see Math
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-13
 */
class Log2 {
	
	
/**
 * Atributo del tipo double que almacena el resultado de la operación logaritmo. 
 */
	private double value;

/**
 * Getter del atributo value. {@link Log2#value}
 * @return double
 */
	public double getValue() {
		return value;
	}

/**
 * Setter del atributo value. {@link Log2#value}
 * @param value Valor a insertar en Log2#value. 
 */
	public void setValue(double value) {
		this.value = value;
	}

/**
 * Constructor de la clase Log2. Lanza una excepción del tipo ArithmeticException
 * si el número recibido por parámetro es negativo. Si no se inicializa el 
 * atributo value con el logaritmo del parámetro recibido en el constructor.
 * @param numero
 * @see ArithmeticException
 * @throws ArithmeticException
 */
	public Log2(double numero) throws ArithmeticException {
		if(Double.isNaN(Math.log(numero)))
			throw new ArithmeticException("Se esperaba un número positivo");
		else
			setValue(Math.log(numero));
	}

	
	public static void main (String arg []) {
		try {
            double aDouble = Double.parseDouble(arg[0]);
			Log2 log = new Log2(aDouble);
			System.out.println(log.getValue());
		} catch(ArrayIndexOutOfBoundsException e1) {
		      System.out.println(e1.toString() + ". Se esperaba un parámetro");
		} catch(NumberFormatException e2) {
		      System.out.println(e2.toString() + ". Se esperaba un parámetro double");
		} catch(ArithmeticException e3) {
			 System.out.println(e3.toString());
		}

	}

}
