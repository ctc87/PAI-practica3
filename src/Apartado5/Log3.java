package Apartado5;

/**
 * <h1>Log3</h1>
 * Log3 es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * Log3 es la clase que ejecuta un programa principal el cual calcula
 * el logaritmo de un número pasado por parámetro. Este es calculado con
 * el método constructor que lanza una excepción si es negativo la cual 
 * se gestiona desde el programa principal.
 * <h4>controla las excepciones</h4>
 * 	1. IllegalArgumentException -> Si se le pasa más de un parámetro.<br/>
 *  2. ArrayIndexOutOfBoundsException -> Si no se le pasan parámetros.<br/>
 *  3. NumberFormatException -> Si se le pasa algo que no sea un número por parámetro.<br/>
 *  4. WrongParameterException -> Si el número pasado como parámetro es negativo.<br/>
 * <br/>
 * El programa trata básicamente del manejo de excepciones mediante bloques try catch
 * o con la palabra reservada throw.
 * @see IllegalArgumentException
 * @see	ArrayIndexOutOfBoundsException
 * @see	NumberFormatException
 * @see WrongParameterException
 * @see Math
 * @author  Carlos Troyano Carmona
 * @version 1.1  
 * @since   2016-02-13
 */
class Log3 {
	
	
/**
 * Atributo del tipo double que almacena el resultado de la operación logaritmo. 
 */
	private double value;

/**
 * Getter del atributo value. {@link Log3#value}
 * @return double
 */
	public double getValue() {
		return value;
	}

/**
 * Setter del atributo value. {@link Log3#value}
 * @param value Valor a insertar en Log3#value. 
 */
	public void setValue(double value) {
		this.value = value;
	}

/**
 * Constructor de la clase Log3. Lanza una excepción del tipo ArithmeticException
 * si el número recibido por parámetro es negativo. Si no se inicializa el 
 * atributo value con el logaritmo del parámetro recibido en el constructor.
 * @param numero
 * @see WrongParameterException
 * @throws WrongParameterException
 */
	public Log3(double numero) throws WrongParameterException {
		if(Double.isNaN(Math.log(numero))) {
			throw new WrongParameterException("Se esperaba un número positivo");
		}else
			setValue(Math.log(numero));
	}

	
	public static void main (String arg []) {
		try {
            double aDouble = Double.parseDouble(arg[0]);
			Log3 log = new Log3(aDouble);
			System.out.println(log.getValue());
		} catch(ArrayIndexOutOfBoundsException e1) {
		      System.out.println(e1.toString() + ". Se esperaba un parámetro");
		} catch(NumberFormatException e2) {
		      System.out.println(e2.toString() + ". Se esperaba un parámetro double");
		} catch(WrongParameterException e3) {
			 System.out.println(e3.toString());
		}

	}

}

