package Apartado4;
import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * <h1>NumOcurrencias</h1>
 * NumOcurrencias es una ejercicio de una práctica de la asignatura: <br/>
 * <em>Programación de aplicaciones interactivas</em> <br/>
 * NumOcurrencias es una clase que cuenta el número de ocurrencias de cada palabra 
 * dentro de un fichero de texto. El nombre del fichero de texto deberá ser pasado 
 * como parámetro en la línea de comandos. Las palabras estarán delimitadas por 
 * espacios, signos de puntuación ( ´ , ; : . ?), comillas " y paréntesis. 
 * Las palabras se contabilizarán sin atender a si están escritas en 
 * mayúsculas o minúsculas (la palabra Bueno se considerara igual que buENo).
 * No se contabilizará una palabra si su primer carácter no es una letra. 
 * Muestre la salida en orden alfabético de palabras con cada palabra 
 * precedida por su contador de ocurrencias.
 * 
 * @see Map
 * @see Scanner
 * @see File
 * @see Exception
 * @see BufferedReader
 * @see Matcher
 * @see Iterator
 * @author  Carlos Troyano Carmona
 * @version 1.2  
 * @since   2015-02-26
 */
public class NumOcurrencias {
/**
 * Atributo mapOcurrencies del tipo Map. Es un mapa que contiene el número de 
 * ocurrencias de una palabra como valor y la propia palabra como clave.
 */
  Map<String, Integer> mapOcurencies; 
  
/**
 * Getter {@link NumOcurrencias#mapOcurencies}
 * @return String fileName().
 */
  public Map<String, Integer> getMapOcurencies() {
    return mapOcurencies;
  }

/**
 * Setter {@link NumOcurrencias#mapOcurencies}
 * @param map del tipo Map<String, Integer>.  
 */
  public void setMapOcurencies(TreeMap<String, Integer> map) {
    this.mapOcurencies = map;
  }

 /**
  * Atributo fileName de tipo String. Contiene el nombre o la ruta del
  * fichero el cual se va analizar.
  */
  private String fileName;
  
/**
 * Getter {@link NumOcurrencias#fileName}
 * @return String fileName().
 */
  public String getFileName() {
    return fileName;
  }

/**
 * Setter {@link NumOcurrencias#fileName}
 * @param fileName Nombre o ruta al fichero a analizar.
 */
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

 /**
  * Método readData. Es un método que lee del atributo filename la ruta 
  * o nombre al fichero. Despúes lo analiza con expresiones regulares
  * para buscar las ocurrencias de cada palabra. Si encuentra una palabra
  * nueva la agrega al atributo mapOcurencies y le añade una ocurrencia. 
  * Si encuentra una palabra repetida añade una ocurrencia a la palabra
  * en el mapa.<br/>
  * Captura las excepciones de tipo fileNotFound. 
  * @see FileNotFoundException
  */
  private void readData() {
    Scanner src;
	File textFile = new File(getFileName());
	try {
	  BufferedReader br = new BufferedReader(new FileReader(textFile));
	  src = new Scanner(br); 
	  Pattern patron = Pattern.compile("^[a-zA-Z]");
	  src.useDelimiter("[\"(),;:.?\\s]");
      while(src.hasNext()) {
        String key = src.next().toLowerCase();
        Matcher match = patron.matcher(key);
        if(match.find()) {
          if(getMapOcurencies().containsKey(key)) {
        	  getMapOcurencies().put(key, getMapOcurencies().get(key) + 1);	
          } else {
        	  getMapOcurencies().put(key, 1);
          }
        }
      }
	} catch(FileNotFoundException e) {
      System.out.println(e.toString());
      e.printStackTrace();
    }
}
	
/**
* Constructor con String para NumOcurrencias. Inicializa el atributo 
* fileName con la cadena pasada por parámetro y el Map con un mapa vacío.
* Después llama al método privado readData.
* @see NumOcurrencias#readData
* @param str String, contiene el nombre o la ruta del fichero el cual
* se va analizar.
*/
  public NumOcurrencias(String str) {
	setMapOcurencies(new TreeMap<String, Integer>());
	setFileName(str);
    readData();
  }
  
/**
 * Método publico imprimirResultados. Imprime por pantalla los resultados del
 * análisis con el formato:<br/>
 * 
 * -Palabra: "palabra" -> Repeticiones: "número repeticiones"
 * @see Iterator
 */
  
  public void imprimirResultados() {
    Iterator<String> it = getMapOcurencies().keySet().iterator();
    while(it.hasNext()) {
      String key = it.next();
      System.out.println("Palabra: " + key + " -> Repeticiones: " + getMapOcurencies().get(key));
    }
  }
} 
