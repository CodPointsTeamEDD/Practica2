public class Participante{
	/*numero de medallas conseguidas por el participante*/
	int numMedallas;

	/*numero de torneos en los que a participado el participante*/
	int numTorneos;
	
	/*cinta que posee el participante*/
	Cinta cinta;

	/** 
	 * Constructor por parametro de Participante
	 * @param numMedallas numero de medallas conseguidas por el participante
	 * @param numTorneos numero de torneos en los que a participado el participante
	 * @param cinta cinta que posee el participante
	*/
	public Participante(int numMedallas, int numTorneos, Cinta cinta){	
		this.numMedallas = numMedallas;
		this.numTorneos = numTorneos;
		this.cinta = cinta;
	}

	// Getters

	/** 
	 * metodo para obtener el numero de medallas
	 * @return devuelve el numero de medallas de Participante
	*/
	public int getNumMedallas(){
		return this.numMedallas;
	}

	/** 
	 * metodo para obtener el numero de torneos en los que ha participado el individuo
	 * @return devuelve el numero de torneos 
	*/
	public int getNumTorneos(){
		return this.numTorneos;
	}

	/** 
	 * metodo para obtener la cinta del participante
	 * @return devuelve la cinta
	*/
	public Cinta getCinta(){
		return this.cinta;
	}
}
