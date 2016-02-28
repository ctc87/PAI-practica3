package Apartado1;

/**
 * <h1>Serpientes</h1>
 * Serpientes es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * Serpientes es una clase que representa a una serpiente. Se considera que la
 * serpiente repta una vez es construida. La idea es desde el programa principal
 * llamar al método reptar que devuelve el número de serpiente que está reptando,
 * el cual se establece en el constructor.
 * 
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-26
 */
public class Serpientes {
  
/**
 * Atributo que le da un número representando a la instancia en el constructor.
 */
	private int numeroSerpiente;
  
/**
 * Getter {@link Serpientes#numeroSerpiente}
 * @return int numeroSerpiente.
 */
    public int getNumeroSerpiente() {
	  return numeroSerpiente;
    }

/**
 * Setter {@link Serpientes#numeroSerpiente}
 * @param numero Número que representa a la serpiente.
 */
    public void setNumeroSerpiente(int numero) {
	  numeroSerpiente = numero;
    }
	
/**
 * Constructor con número para Serpientes. Inicializa el atributo numeroSerpiente
 * a el valor pasado por parámetro.
 * @param num Número que representa a la serpiente.
 */
    public Serpientes(int num) {
	  setNumeroSerpiente(num);
    }
	
/**
 * Método reptar.Imprime por consola el número de serpiente que representa
 * a la serpiente que esta reptando
 */
    public void reptar() {
      System.out.println("La serpiente número " + getNumeroSerpiente() + " está reptando." );
    }
}
