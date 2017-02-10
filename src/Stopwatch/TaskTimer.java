package Stopwatch;

/**
 * TaskTimer class that will compute and print the elapsed time for any task,
 * without any duplicate code.
 * @author Napong Dungduangsasitorn
 *
 */

public class TaskTimer {
	
	/* timer for use Stopwatch compute elapsed time */
	private static Stopwatch timer;
	
	/**
	 * create Stopwatch. 
	 */
	
	public TaskTimer(){
		this.timer = new Stopwatch();
	}
	
	/**
	 * measureAndPrint run the task, measure the time 
	 * and print elapsed time.
	 * @param runnable
	 */
	
	public static void measureAndPrint(Runnable runnable){
		timer.start();
		runnable.run();
		timer.stop();
		System.out.printf("%s \n", runnable.toString());
		System.out.printf("Elapsed time : %.6f sec \n\n",timer.getElapsed());
	}
	
	/**
	 * getTaskTimer for use new TaskTimer
	 * @return new TaskTimer 
	 */
	
	public static TaskTimer getTaskTimer(){
		return new TaskTimer();
	}
}
