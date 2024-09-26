package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

import java.util.List;

public class LIFO implements Strategy {

	public LIFO() {
		
	}

	public JobDescription next(List<JobDescription> jobs) {
		// Si la lista de trabajos esta vacia el turno siguiente es null
		if(jobs.isEmpty())
			return null;

		return jobs.getLast();
	}
	
}
