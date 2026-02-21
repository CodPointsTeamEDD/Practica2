import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		/* guadando el indice de victorias de a */
		double indiceA = a.indiceDeVictorias();
		/* guardando el nivel numerico de la cinta */
		int nvlNumericoCinta = a.cinta.getNivelNumerico();

		for(int i = 0; i<g.length; i++){
			/*
				Comparando indice de victorias y determinar si Participante "a" pierde,
				empata o gana con g[i]
			*/
			if (indiceA > g[i].indiceDeVictorias()) {
				/* tamanioArreglo++ si "a" gana a g[i] */
				tamanioArreglo++;
			} else if (indiceA == g[i].indiceDeVictorias()) {
				/*
					Criterio de desempate en caso de tener ambos Participantes el
				   	mismo indice de victoria
				*/
				if (nvlNumericoCinta > g[i].cinta.getNivelNumerico()) {
					/* tamanioArreglo++ si "a" tiene cinta de mayor rango que g[i] */
					tamanioArreglo++;
				}
			}
		}

		/* Creando arreglo con el tamanio correspondiente */
		Participante[] perdedores = new Participante[tamanioArreglo];

		/* Variable auxiliar que representa indice en arreglo Perdedores */
		int iPer = 0;

		/* Agregando elementos al arreglo "perdedores" */
		for(int i = 0; i<g.length; i++){
			/*
				Comparando indice de victorias y determinar si Participante "a" pierde,
				empata o gana con g[i]
			*/
			if (indiceA > g[i].indiceDeVictorias()) {
				/*
					Insertando elemento en arreglo "perdedores" si Participante "a"
					gana a g[i]
				*/
				perdedores[iPer] = g[i];
				iPer++;
			} else if (indiceA == g[i].indiceDeVictorias()) {
				/*
					Criterio de desempate en caso de tener ambos Participantes el
				   	mismo indice de victoria
				*/
				if (nvlNumericoCinta > g[i].cinta.getNivelNumerico()) {
					/*
						Agregando elemento al arreglo "Perdedores" si Participante
						"a" tiene cinta de mayor rango que g[i]
					*/
					perdedores[iPer] = g[i];
					iPer++;
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
		/* guadando el indice de victorias de a */
		double indiceA = a.indiceDeVictorias();
		/* guardando el nivel numerico de la cinta */
		int nvlNumericoCinta = a.cinta.getNivelNumerico();

		for(int i = 0; i<g.length; i++){
			/*
				Comparando indice de victorias y determinar si Participante "a" pierde,
				empata o gana con g[i]
			*/
			if (indiceA < g[i].indiceDeVictorias()) {
				/* tamanioArreglo++ si "a" pierde con g[i] */
				tamanioArreglo++;
			} else if (indiceA == g[i].indiceDeVictorias()) {
				/*
					Criterio de desempate en caso de tener ambos Participantes el
				   	mismo indice de victoria
				*/
				if (nvlNumericoCinta < g[i].cinta.getNivelNumerico()) {
					/* tamanioArreglo++ si "a" tiene cinta de menor rango que g[i] */
					tamanioArreglo++;
				}
			}
		}

		/* Creando arreglo con el tamanio correspondiente */
		Participante[] ganadores = new Participante[tamanioArreglo];

		/* Variable auxiliar que representa indice en arreglo Perdedores */
		int iPer = 0;

		/* Agregando elementos al arreglo "ganadores" */
		for(int i = 0; i<g.length; i++){
			/*
				Comparando indice de victorias y determinar si Participante "a" pierde,
				empata o gana con g[i]
			*/
			if (indiceA < g[i].indiceDeVictorias()) {
				/*
					Insertando elemento en arreglo "perdedores" si Participante "a"
					gana a g[i]
				*/
				ganadores[iPer] = g[i];
				iPer++;
			} else if (indiceA == g[i].indiceDeVictorias()) {
				/*
					Criterio de desempate en caso de tener ambos Participantes el
				   	mismo indice de victoria
				*/
				if (nvlNumericoCinta < g[i].cinta.getNivelNumerico()) {
					/*
						Agregando elemento al arreglo "Perdedores" si Participante
						"a" tiene cinta de mayor rango que g[i]
					*/
					ganadores[iPer] = g[i];
					iPer++;
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
	 *         participsante a
	 */
	public static Participante[] mismaCinta(Participante a, Participante[] g) {

		/** variables usadas para determinar el tamanio del arreglo */
		int numTotal = 0;
		int tamanioNuevoArreglo;
		String nombreA = a.getCinta().getNombre();

		// Ciclo para saber que tamanio tendra nuestro nuevo arreglo
		for (int i = 0; i < g.length; i++) {
			if ((nombreA).equals(g[i].getCinta().getNombre())) {
				numTotal++;
			}
		}

		tamanioNuevoArreglo = numTotal; // tamanio del arreglo

		/** Creando el arreglo con el tamanio correspondiente  */
		Participante[] mismas = new Participante[tamanioNuevoArreglo];

		/* Variable auxiliar que representa indice en arreglo mismas */
		int iMism = 0;

		/** Llenando el arreglo tal que cumpla la condicion requerida */
		for (int i = 0; i < g.length; i++) {
			if ((nombreA).equals(g[i].getCinta().getNombre())) {
				mismas[iMism] = g[i];
				iMism++;
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
			if (g[i].indiceDeVictorias() >= indiceA - 0.10 && g[i].indiceDeVictorias() <= indiceA + 0.10) {
				numTotal++;
			}
		}

		tamanioNuevoArreglo = numTotal; // tamanio del arreglo

		/** creando el arreglo con el tamanio correspondiente */
		Participante[] similar = new Participante[tamanioNuevoArreglo];

		/* Variable auxiliar que representa indice en arreglo mismas */
		int iMism = 0;

		/** llenando el arreglo tal que cumpla la condicion requerida */
		for (int i = 0; i < g.length; i++) {
			if (g[i].indiceDeVictorias() >= indiceA - 0.10 && g[i].indiceDeVictorias() <= indiceA + 0.10) {
				similar[iMism] = g[i];
				iMism++;
			}
		}

		return similar;
	}


	public static String extraerSubcadena(String cadena, char separador, int posicionElemento){
		/* Inicializando variables */
		String subCadena = cadena;
		int indiceSeparador;

		/*
			Borrando elementos de la cadena anteriores a posicionElemento,
			usando el separador pasado como parametro al metodo
		*/
		for (int i = 0; i < posicionElemento; i++) {
			/* Obteniendo el indice del separador i */
			indiceSeparador = subCadena.indexOf(separador);

			/* Removiendo el primer elemento de la cadena */
			subCadena = subCadena.substring(indiceSeparador+1);
		}

		/* Obteniendo indice del siguiente separador */
		indiceSeparador = subCadena.indexOf(separador);

		if (indiceSeparador == -1) {
			/* Obteniendo el elemento buscado */
			return subCadena;			
		} 

		/* Obteniendo el elemento buscado */
		String elemento = subCadena.substring(0, indiceSeparador);			

		/* Eliminando posibles espacios extra */
		elemento = elemento.trim();

		/* Retornando el elemento */
		return elemento;
	}

	public static String extraerNombre(String cadena){
		return AdivinadorResultados.extraerSubcadena(cadena, ',', 0);
	}
	public static int extraerNumMedallas(String cadena){
		int numMedallas;
		String subcadena = AdivinadorResultados.extraerSubcadena(cadena, ',', 1);

		/* Quitando "M:" */
		subcadena = AdivinadorResultados.extraerSubcadena(subcadena, ':', 1);

		/* Asignar un INT a numMedallas */
		numMedallas = Integer.parseInt(subcadena);

		return numMedallas;
	}
	public static int extraerParticipaciones(String cadena){
		int numPart;
		String subcadena = AdivinadorResultados.extraerSubcadena(cadena, ',', 2);

		/* Quitando "P:" */
		subcadena = AdivinadorResultados.extraerSubcadena(subcadena, ':', 1);

		/* Asignar un INT a numPart */
		numPart = Integer.parseInt(subcadena);

		return numPart;
	}
	public static String extraerNombreCinta(String cadena){
		String subcadena = AdivinadorResultados.extraerSubcadena(cadena, ',', 3);

		/* Quitando "N:" */
		subcadena = AdivinadorResultados.extraerSubcadena(subcadena, ':', 1);

		return subcadena;
	}


	public static void main(String[] args) {
		/* ----------------------------------------------------- */
		/*     Lectura de archivo y extracción de información    */
		/* ----------------------------------------------------- */

		/* Nombre del archivo a leer */
		String nombreArchivo = "participantes.txt";

		/* Numero de Participantes en el archivo */
		int numPart = 0;

		/* Lectura del archivo para estimar numero de participantes */
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
				numPart++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

		/* Variables que almacenarán participantes */
		Participante[] g = new Participante[numPart-1]; 
		Participante a = new Participante("", 0, 0, new Cinta(Cinta.NOMBRES_CINTAS[0]));

		/* Variables temporales que se pasarán al constructor de Participante*/
		String nombreParticipante;
		int numMedallas;
		int numTorneos;
		String nombreCinta;
		Cinta cinta;

		/* Lectura del archivo para crear participates */
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
			/* Variable auxiliar que almacena la linea leida */
            String linea;

			/* Cantidad de lineas leidas */
			int i = 0;

            while ((linea = br.readLine()) != null) {
				/* Recuperando valores de la linea de texto */
				nombreParticipante = AdivinadorResultados.extraerNombre(linea); 
				numMedallas = AdivinadorResultados.extraerNumMedallas(linea); 
				numTorneos = AdivinadorResultados.extraerParticipaciones(linea); 
				nombreCinta = AdivinadorResultados.extraerNombreCinta(linea); 
				cinta = new Cinta(nombreCinta);				

				/* 
					Creando el jugador "a" o insertando jugadores en arreglo de tipo 
					Participante"g"
				*/
				if (i != 0) {
					g[i-1] = new Participante(nombreParticipante, numMedallas, numTorneos, cinta);
					i++;
				} else {
					a = new Participante(nombreParticipante, numMedallas, numTorneos, cinta);
					i++;
				}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

		/* ----------------------------------------------------- */
		/* Probando metodos y mostrando el resultado en pantalla */
		/* ----------------------------------------------------- */
		
		System.out.println("¡¡Bienvenido usuario!!");
		System.out.println("Este programa lee la información de un archivo .txt y la usa para extraer información sobre Participantes.");

		System.out.println("");

		System.out.println("PRIMER USUARIO (USUARIO A COMPARAR):");
		System.out.println(a);

		System.out.println("");

		System.out.println("OTROS PARTICIPANTES: ");
		for (Participante part : g) {
			System.out.println(part);
		}

		System.out.println("");

		/* Probando metodo alumnoALesGana */
		System.out.println("El participante " + a.getNombre() + "les gana a los siguientes participantes:");
		Participante[] perdedores = alumnoALesGana(a, g);
		for (Participante part : perdedores) {
			System.out.println("-" + part.getNombre());
		}

		System.out.println(" ");

		/* Probando metodo alumnoALesGana */
		System.out.println("El participante " + a.getNombre() + " pierde contra los siguientes participantes:");
		Participante[] ganadores = alumnoAPierde(a, g);
		for (Participante part : ganadores) {
			System.out.println("-" + part.getNombre());
		}

		System.out.println(" ");


		/* Probando metodo indicesDeVictoria */
		System.out.println("Los siguientes son los indices de victoria de todos los participantes del arreglo");
		double[] indicesVictoria = indicesVictoria(g);
		for (Double ind : indicesVictoria) {
			System.out.println(ind);
		}

		System.out.println(" ");

		/* Probando metodo mismaCinta */
		System.out.println("El participante " + a.getNombre() + " tiene la misma cinta que los siguientes participantes:");
		Participante[] mismaCinta = mismaCinta(a, g);
		for (Participante part : mismaCinta) {
			System.out.println("-" + part.getNombre());
		}

		/* Probando metodo indiceSimilarAlAlumnoA */
		System.out.println("El participante " + a.getNombre() + " tiene un indice de victoria similar al de los siguientes participantes:");
		Participante[] indSimilar = indicesimilarAlAlumnoA(a, g);
		for (Participante part : indSimilar) {
			System.out.println("-" + part.getNombre());
		}

	}
}
