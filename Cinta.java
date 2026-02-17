/**
 * Clase {@code Cinta}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class Cinta{

	/** Nombre de identificacion de la cinta */
	private String nombre;

	/** Color de la cinta */
	private String color;


	/**
     * Constructor de la clase {@code Cinta}
     * 
     * @param nombre nombre de la cinta
     * @param color color de la cinta
     */
	public Cinta(String nombre, String color){
		this.nombre = nombre;
		this.color = color;
	}

	/** Getters */

	/**
	 * Metodo que obtiene el nombre de la cinta
	 * @return Nombre de la cinta
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Metodo que obtiene el color de la cinta
	 * @return Color de la cinta
	 */
	public String getColor(){
		return color;
	}

	/** Setters */

	/**
	 * Metodo que asigna el nombre a la cinta
	 * @param nombre nombre a asignar
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	 * Metodo que asigna el color a la cinta
	 * @param color color a asignar
	 */
	public void setColor(String color){
		this.color = color;
	}
}
