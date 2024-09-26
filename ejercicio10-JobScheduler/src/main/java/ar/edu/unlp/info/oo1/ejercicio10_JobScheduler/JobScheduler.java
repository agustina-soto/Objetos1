package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	private Strategy strategy;
	private List<JobDescription> pendentJobs;
	
	public JobScheduler() {
		this.pendentJobs = new ArrayList<>();
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public List<JobDescription> getJobs() {
		return this.pendentJobs;
	}
	
	public void schedule(JobDescription job) {
		this.pendentJobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		this.pendentJobs.remove(job);
	}
	
	public JobDescription next() {
		JobDescription nextJob = strategy.next(this.pendentJobs); // puedo cambiar la variable de instancia de String a Strategy?
		this.unschedule(nextJob);
		return nextJob;
	}

}
