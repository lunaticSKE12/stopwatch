package Stopwatch;

public class TaskTimer {
	
	private static Stopwatch timer;
	
	public TaskTimer(){
		this.timer = new Stopwatch();
	}
	
	public static void measureAndPrint(Runnable runnable){
		timer.start();
		runnable.run();
		timer.stop();
		
		System.out.printf("Task : %s \n", runnable.toString());
		System.out.printf("Elapsed time : %.6f sec \n\n",timer.getElapsed());
	
	}
	
	public static TaskTimer getTaskTimer(){
		return new TaskTimer();
	}
	

}
