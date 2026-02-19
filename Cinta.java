/**
 * Clase {@code Cinta}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class Cinta {

	/** Nombre de identificacion de la cinta */
	private String nombre;

	/** Nivel numerico */
	private int nivelNumerico;

	/** CONSTANTES (se usarán al momento de crear objetos de tipo Cinta) */
	public static Object[] CINTA_BLANCA  = {"Blanca", 1};
	public static Object[] CINTA_NARANJA = {"Naranja", 2};
	public static Object[] CINTA_MORADA  = {"Morada", 3};
	public static Object[] CINTA_AZUL    = {"Azul", 4};
	public static Object[] CINTA_VERDE 	 = {"Verde", 5};

	/**
	 * Constructor de la clase {@code Cinta}
	 * 
	 * @param nombre nombre de la cinta
	 */
	public Cinta(String nombre, int nivelNumerico) {
		this.nombre = nombre;
		this.nivelNumerico = nivelNumerico;
	}

	/** Getters */

	/**
	 * Metodo que obtiene el nombre de la cinta
	 * 
	 * @return Nombre de la cinta
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que obtiene el nivel numerico de la cinta
	 * 
	 * @return Nivel de la cinta
	 */
	public int getNivelNumerico() {
		return nivelNumerico;
	}

	/** Setters */

	/**
	 * Metodo que asigna el nombre a la cinta
	 * 
	 * @param nombre nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo que asigna el nivel numerico de la cinta
	 * 
	 * @param nombre nivel a asignar
	 */
	public void setNivelNumerico(int nivel) {
		this.nivelNumerico = nivel;
	}

}
