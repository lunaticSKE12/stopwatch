package Stopwatch;

public class Main {
	public static void main(String[] arg){
		/*Stopwatch timmer = new Stopwatch();
		System.out.println("Strting task");
		timmer.start();
		System.out.println(timmer.getElapsed());
		System.out.println(timmer.isRunning());
		timmer.stop();
		System.out.printf("elapsed = %.6f sec\n", timmer.getElapsed());
		if ( timmer.isRunning() ) System.out.println("timer is still running!"); 
		else System.out.println("timer is stopped"); 
		
		*/
		testAppendToString task1 = new testAppendToString(50000);
		testAppendToStringBuilder task2 = new testAppendToStringBuilder(100000);
		TaskTimer timer = TaskTimer.getTaskTimer();
		
		timer.measureAndPrint(task1);
		timer.measureAndPrint(task2);
	}
}