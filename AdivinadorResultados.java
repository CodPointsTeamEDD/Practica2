import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdivinadorResultados {

	public static Participante[] alumnoALesGana(Participante a, Participante[] g) {
		/* Aquí va tu código */
	}

	public static Participante[] alumnoAPierde(Participante a, Participante[] g) {
		/* Aquí va tu código */
	}

	/**
	 * Metodo que guarda en un arreglo los indices de victoria de los participantes
	 * 
	 * @param g arreglo de participantes denotados por g
	 * @return arreglo con los indices de victoria de los participantes
	 */
	public static double[] indicesVictoria(Participante[] g) {

		double[] indices = new double[g.length];

		for (int i = 0; i < g.length; i++) {
			indices[i] = g[i].indiceDeVictorias();
		}

		return indices;

	}

	/**
	 * Metodo que determina cuales participantes tienen la misma cinta que el
	 * participante a.
	 * 
	 * @param a Participante denotado por a
	 * @param g Arreglo de participantes denotados por g
	 * @return Arreglo con los participantes tienen la misma cinta que el
	 *         participante a
	 */
	public static Participante[] mismaCinta(Participante a, Participante[] g) {

		int numTotal = 0;
		int tamanioNuevoArreglo;

		// Ciclo para saber que tamanio tendra nuestro nuevo arreglo
		for (int i = 0; i < g.length; i++) {
			if ((a.getCinta().getNombre()).equals(g[i].getCinta().getNombre())) {
				numTotal++;
			}
		}

		tamanioNuevoArreglo = numTotal; // tamanio del arreglo

		Participante[] mismas = new Participante[tamanioNuevoArreglo];

		for (int i = 0; i < g.length; i++) {
			if ((a.getCinta().getNombre()).equals(g[i].getCinta().getNombre())) {
				mismas[i] = g[i];
			}
		}

		return mismas;
	}

	/**
	 * Metodo que determina que participantes del grupo presentan un ındice de
	 * victoria cuya diferencia respecto al ındice de victoria del alumno a sea,
	 * como maximo, de 0 - 10.
	 * 
	 * @param a Participante denotado por a
	 * @param g Arreglo de participantes denotados por g
	 * @return Arreglo con participantes del grupo presentan un ındice de victoria
	 *         cuya diferencia respecto al ındice de victoria del alumno a sea, como
	 *         maximo, de 0 - 10.
	 */
	public static Participante[] indicesimilarAlAlumnoA(Participante a, Participante[] g) {
		int numTotal = 0;
		int tamanioNuevoArreglo;

		double indiceA = a.indiceDeVictorias();
		

		// Ciclo para saber que tamanio tendra nuestro nuevo arreglo
		for (int i = 0; i < g.length; i++) {
			if (g[i].indiceDeVictorias() >= indiceA - 10 && g[i].indiceDeVictorias() <= indiceA + 10) {
				numTotal++;
			}
		}

		tamanioNuevoArreglo = numTotal; // tamanio del arreglo

		Participante[] similar = new Participante[tamanioNuevoArreglo];

		for (int i = 0; i < g.length; i++) {
			if (g[i].indiceDeVictorias() >= indiceA - 10 && g[i].indiceDeVictorias() <= indiceA + 10) {
				similar[i] = g[i];
			}
		}

		return similar;
	}

	public static void main(String[] args) {
		/* Aquí va tu código */
	}

}
