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

	/**
	 * Constructor de la clase {@code Cinta}
	 * 
	 * @param nombre nombre de la cinta
	 */
	public Cinta(String nombre) {
		this.nombre = nombre;
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

	/** Setters */

	/**
	 * Metodo que asigna el nombre a la cinta
	 * 
	 * @param nombre nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
