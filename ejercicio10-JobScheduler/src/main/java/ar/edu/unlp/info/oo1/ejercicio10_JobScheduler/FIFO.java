package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

import java.util.List;

public class FIFO implements Strategy {
	
	public FIFO() {
		
	}

	public JobDescription next(List<JobDescription> jobs) {
		// Si la lista de trabajos esta vacia el turno siguiente es null
		if(jobs.isEmpty())
			return null;

		return jobs.get(0); // get(0) no tira excepcion si es null? puedo obviar el if de arriba?
	}
	
}
