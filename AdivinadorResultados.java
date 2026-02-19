/**
 * Clase {@code AdivinadorResultadps}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */


public class AdivinadorResultados {

	/**
	 * Metodo que determina cúales participantes de un grupo perderían un
	 * enfrentamiento ante el Participante "a"
	 * 
	 * @param a Participante denotado por a
	 * @param g Arreglo de participantes denotados por g
	 * @return Arreglo de tipo Participante que contiene solo los participantes 
	 *		   que perdirían un enfrentamiento ante el participante "a", usando 
	 *		   como criterio el indice de victorias. Ante un posible empate se 
	 *		   usa como criterio el rango de la cienta que poseen 
	 */
	public static Participante[] alumnoALesGana(Participante a, Participante[] g){
		/* Obteniendo el tamanio que debe tener alumnosQuePierdenConA */
		int tamanioArreglo = 0;
		for(int i = 0; i<g.length; i++){
			/* 
				Comparando indice de victorias y determinar si Participante "a" pierde, 
				empata o gana con g[i] 
			*/
			if (a.indiceDeVictorias() > g[i].indiceDeVictorias()) {
				/* tamanioArreglo++ si "a" gana a g[i] */
				tamanioArreglo++;
			} else if (a.indiceDeVictorias() == g[i].indiceDeVictorias()) {
				/* 
					Criterio de desempate en caso de tener ambos Participantes el 
				   	mismo indice de victoria
				*/
				if (a.cinta.getNivelNumerico() > g[i].cinta.getNivelNumerico()) {
					/* tamanioArreglo++ si "a" tiene cinta de mayor rango que g[i] */
					tamanioArreglo++;
				} 
			}
		}

		/* Creando arreglo con el tamanio correspondiente */
		Participante[] perdedores = new Participante[tamanioArreglo];

		/* Agregando elementos al arreglo "perdedores" */
		for(int i = 0; i<g.length; i++){
			/* 
				Comparando indice de victorias y determinar si Participante "a" pierde, 
				empata o gana con g[i] 
			*/
			if (a.indiceDeVictorias() > g[i].indiceDeVictorias()) {
				/* 
					Insertando elemento en arreglo "perdedores" si Participante "a"
					gana a g[i] 
				*/
				perdedores[i] = g[i];
			} else if (a.indiceDeVictorias() == g[i].indiceDeVictorias()) {
				/* 
					Criterio de desempate en caso de tener ambos Participantes el 
				   	mismo indice de victoria
				*/
				if (a.cinta.getNivelNumerico() > g[i].cinta.getNivelNumerico()) {
					/* 
						Agregando elemento al arreglo "Perdedores" si Participante 
						"a" tiene cinta de mayor rango que g[i] 
					*/
					perdedores[i] = g[i];
				} 
			}
		}

		return perdedores;
	}

	/**
	 * Metodo que determina cúales participantes de un grupo ganarían un
	 * enfrentamiento ante el Participante "a"
	 * 
	 * @param a Participante denotado por a
	 * @param g Arreglo de participantes denotados por g
	 * @return Arreglo de tipo Participante que contiene solo los participantes 
	 *		   que ganarían un enfrentamiento ante el participante "a", usando 
	 *		   como criterio el indice de victorias. Ante un posible empate se 
	 *		   usa como criterio el rango de la cienta que poseen 
	 */
	public static Participante[] alumnoAPierde (Participante a, Participante[] g){
		/* Obteniendo el tamanio que debe tener alumnosQuePierdenConA */
		int tamanioArreglo = 0;
		for(int i = 0; i<g.length; i++){
			/* 
				Comparando indice de victorias y determinar si Participante "a" pierde, 
				empata o gana con g[i] 
			*/
			if (a.indiceDeVictorias() < g[i].indiceDeVictorias()) {
				/* tamanioArreglo++ si "a" pierde con g[i] */
				tamanioArreglo++;
			} else if (a.indiceDeVictorias() == g[i].indiceDeVictorias()) {
				/* 
					Criterio de desempate en caso de tener ambos Participantes el 
				   	mismo indice de victoria
				*/
				if (a.cinta.getNivelNumerico() < g[i].cinta.getNivelNumerico()) {
					/* tamanioArreglo++ si "a" tiene cinta de menor rango que g[i] */
					tamanioArreglo++;
				} 
			}
		}

		/* Creando arreglo con el tamanio correspondiente */
		Participante[] ganadores = new Participante[tamanioArreglo];

		/* Agregando elementos al arreglo "perdedores" */
		for(int i = 0; i<g.length; i++){
			/* 
				Comparando indice de victorias y determinar si Participante "a" pierde, 
				empata o gana con g[i] 
			*/
			if (a.indiceDeVictorias() > g[i].indiceDeVictorias()) {
				/* 
					Insertando elemento en arreglo "perdedores" si Participante "a"
					gana a g[i] 
				*/
				ganadores[i] = g[i];
			} else if (a.indiceDeVictorias() == g[i].indiceDeVictorias()) {
				/* 
					Criterio de desempate en caso de tener ambos Participantes el 
				   	mismo indice de victoria
				*/
				if (a.cinta.getNivelNumerico() > g[i].cinta.getNivelNumerico()) {
					/* 
						Agregando elemento al arreglo "Perdedores" si Participante 
						"a" tiene cinta de mayor rango que g[i] 
					*/
					ganadores[i] = g[i];
				} 
			}
		}

		return ganadores;
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

		/** variables usadas para determinar el tamanio del arreglo */
		int numTotal = 0;
		int tamanioNuevoArreglo;

		// Ciclo para saber que tamanio tendra nuestro nuevo arreglo
		for (int i = 0; i < g.length; i++) {
			if ((a.getCinta().getNombre()).equals(g[i].getCinta().getNombre())) {
				numTotal++;
			}
		}

		tamanioNuevoArreglo = numTotal; // tamanio del arreglo

		/** Creando el arreglo con el tamanio correspondiente  */
		Participante[] mismas = new Participante[tamanioNuevoArreglo];

		/** Llenando el arreglo tal que cumpla la condicion requerida */
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
		/** variables usadas para determinar el tamanio del arreglo */
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

		/** creando el arreglo con el tamanio correspondiente */
		Participante[] similar = new Participante[tamanioNuevoArreglo];

		/** llenando el arreglo tal que cumpla la condicion requerida */
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
