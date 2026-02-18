import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdivinadorResultados{

	public static Participante[] alumnoALesGana(Participante a, Participante[] g){
		Participante[] alumnosQuePierdenConA;

		// Obtener el tamanio que debe tener alumnosQuePierdenConA
		int tamanioArreglo = 0;
		for(int i = 0; i<g.length; i++){
			// Comparando indice de victorias de Participante "a" con Participante g[i]
			if (a.indiceDeVictorias() > g[i].indiceDeVictorias()) {
				// Si ""
				tamanioArreglo++;
			} else if (a.indiceDeVictorias() == g[i].indiceDeVictorias()) {
				if (a.cinta.getNivelNumerico() > g[i].cinta.getNivelNumerico()) {
					tamanioArreglo++;
				} 
			}
		}

		return alumnosQuePierdenConA;
	}
	
	public static Participante[] alumnoAPierde (Participante a, Participante[] g){
		/*Aquí va tu código*/
	}
	
	public static double[] indicesVictoria(Participante[] g){
		/*Aquí va tu código*/
	}

	public static Participante[] mismaCinta(Participante a, Participante[] g){
		/*Aquí va tu código*/
	}
	
	public static Participante[] indicesimilarAlAlumnoA(Participante a, Participante[] g){
		/*Aquí va tu código*/
	}
	
	public static void main(String[] args){
		/*Aquí va tu código*/
	}


}
