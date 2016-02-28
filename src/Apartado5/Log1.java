package Apartado5;

/**
 * <h1>Log1</h1>
 * Log1 es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * Log1 es la clase que ejecuta un programa principal el cual calcula
 * el logaritmo de un número pasado por parámetro.
 * <h4>controla las excepciones<h4/>
 * 	-IllegalArgumentException -> Si se le pasa más de un parámetro.
 *  -ArrayIndexOutOfBoundsException -> Si no se le pasan parámetros.
 *  -NumberFormatException -> Si se le pasa algo que no sea un número por parámetro.
 * <br/>
 * El programa trata básicamente del manejo de excepciones mediante bloques try catch
 * o con la palabra reservada throw.
 * @see IllegalArgumentException
 * @see	ArrayIndexOutOfBoundsException
 * @see	NumberFormatException
 * @see Math
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-13
 */
class Log1 {
  public static void main (String args []) {
    if(args.length > 1) {
	  throw new IllegalArgumentException("Exactamente un parámetro requerido");
    } 
    try {
      double aDouble = Double.parseDouble(args[0]);
      System.out.println(Math.log(aDouble));
    } catch (ArrayIndexOutOfBoundsException e1) {
      System.out.println(e1.toString() + ". Se esperaba un parámetro");
    } catch (NumberFormatException e2) {
      System.out.println(e2.toString() + ". Se esperaba un parámetro double");
    }
  }
}
