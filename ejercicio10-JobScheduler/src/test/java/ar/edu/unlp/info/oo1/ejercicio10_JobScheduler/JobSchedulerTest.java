package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    // Crea e inicializa los jobs - no se tiene en cuenta la estrategia todavia
    private void initializeJobs() {
        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
    	// FIFO Scheduler
        JobScheduler fifoScheduler = new JobScheduler();
        Strategy FS = new FIFO();
        
        // FIFO Strategy (se setea en el FIFO Scheduler
        fifoScheduler.setStrategy(FS);
        
        return fifoScheduler;
    }

    private JobScheduler newLifoScheduler() {
        //LIFO Scheduler
    	JobScheduler lifoScheduler = new JobScheduler();
    	Strategy LS = new LIFO();
    	
    	// LIFO Strategy
        lifoScheduler.setStrategy(LS);
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        // HighestPriority (HP) Scheduler
    	JobScheduler priorityScheduler = new JobScheduler();
    	Strategy HP = new HighestPriority();

    	// HighestPriority Strategy
        priorityScheduler.setStrategy(HP);
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
        // MostEffort (ME) Scheduler
    	JobScheduler effortScheduler = new JobScheduler();
    	Strategy ME = new MostEffort();
    	
    	// ME Strategy
        effortScheduler.setStrategy(ME);
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new JobScheduler();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
