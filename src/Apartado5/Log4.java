package Apartado5;

/**
 * <h1>Log4</h1>
 * Log4 es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * Log4 es la clase que ejecuta un programa principal el cual calcula
 * el logaritmo de un número pasado por parámetro. Este es calculado con
 * el método constructor que lanza una excepción si es negativo la cual 
 * se gestiona desde el programa principal.
 * <h4>controla las excepciones<h4/>
 * 	-IllegalArgumentException -> Si se le pasa más de un parámetro.
 *  -ArrayIndexOutOfBoundsException -> Si no se le pasan parámetros.
 *  -NumberFormatException -> Si se le pasa algo que no sea un número por parámetro.
 *  -WrongParameterException -> Si el número pasado como parámetro es negativo
 * <br/>
 * El programa trata básicamente del manejo de excepciones mediante bloques try catch
 * o con la palabra reservada throw.
 * @see	ArrayIndexOutOfBoundsException
 * @see	NumberFormatException
 * @see WrongParameterException
 * @see Math
 * @author  Carlos Troyano Carmona
 * @version 1.1  
 * @since   2016-02-13
 */
class Log4 {
	
	
/**
 * Atributo del tipo double que almacena el resultado de la operación logaritmo. 
 */
	private double value;

/**
 * Getter del atributo value. {@link Log4#value}
 * @return double
 */
	public double getValue() {
		return value;
	}

/**
 * Setter del atributo value. {@link Log4#value}
 * @param value Valor a insertar en Log4#value. 
 */
	public void setValue(double value) {
		this.value = value;
	}

/**
 * Constructor de la clase Log4. Lanza una excepción del tipo ArithmeticException
 * si el número recibido por parámetro es negativo. Si no se inicializa el 
 * atributo value con el logaritmo del parámetro recibido en el constructor.
 * @param numero
 * @see WrongParameterException
 * @throws WrongParameterException
 */
	public Log4(String numero) throws WrongParameterException {
      double aDouble;
        try {
          aDouble = Double.parseDouble(numero);
          if(aDouble < 0 ) {
            throw new WrongParameterException("Se esperaba un número positivo");
			} else {
			  setValue(Math.log(aDouble));
			}
		} catch(NumberFormatException e2) {
			throw new WrongParameterException(e2, "Se esperaba un parámetro double");	
		}
	}

	
	public static void main (String arg []) {
		try {
			Log4 log = new Log4(arg[0]);
			System.out.println(log.getValue());
		} catch(ArrayIndexOutOfBoundsException e1) {
		      System.out.println(e1.toString() + ". Se esperaba un parámetro");
		} catch(WrongParameterException e2) {
			 System.out.println(e2.toString());
		}

	}

}

