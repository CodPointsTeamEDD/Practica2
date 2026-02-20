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

	/** CONSTANTES */
	public static String[] NOMBRES_CINTAS = {"Kaimua", "Moli", "Lua", "Moana", "Ulakui"};
	public static int[] NIVELES_NUMERICOS = {1, 2, 3, 4, 5};

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
	 * @return Nivel de la cinta
	 */
	public int getNivelNumerico() {
		return nivelNumerico;
	}

	/**
	 * Metodo que obtiene el nivel numerico de la cinta dado un nombre
	 * @param nombreDeLaCinta
	 * @return Nivel de la cinta
	 */
	public static int getNivelNumerico(String nombreCinta) {
		int indiceNombre = 0;
		int nivelNumerico;

		/* Obteniendo el indice del nombre*/
		for (int i = 0; i < Cinta.NOMBRES_CINTAS.length; i++) {
			if (!nombreCinta.equals(NOMBRES_CINTAS[i]) || !nombreCinta.equals(NOMBRES_CINTAS[i] + " ") ) {
				indiceNombre++;
			} else{
				break;
			}
		}

		/* Obteniendo el nivel correspondiente */
		nivelNumerico = Cinta.NIVELES_NUMERICOS[indiceNombre - 1];

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
