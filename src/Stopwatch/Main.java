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
		testSumDoublePrimitive test3 = new testSumDoublePrimitive(1000000000,500000);
		testSumDouble test4 = new testSumDouble(1000000000,500000);
		testSumBigDecimal test5 = new testSumBigDecimal(1000000000,500000);
		
		TaskTimer timer = TaskTimer.getTaskTimer();
		
		/*timer.measureAndPrint(task1);
		timer.measureAndPrint(task2);
		timer.measureAndPrint(test3);
		timer.measureAndPrint(test4);*/
		timer.measureAndPrint(test5);
	}
}