package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

import java.util.List;

public class MostEffort implements Strategy {
	
	public MostEffort() {
		
	}

	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.stream().
									max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
									.orElse(null);
		return nextJob;
	}

	
}
