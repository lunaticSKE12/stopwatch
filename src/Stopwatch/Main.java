package Stopwatch;


/**
 * testing TaskTimer and tasks.
 * @author Napong Dungduangsasitorn
 *
 */

public class Main {
	public static void main(String[] arg){
		
		/* task to test */
		
		testAppendToString task1 = new testAppendToString(50000);
		testAppendToStringBuilder task2 = new testAppendToStringBuilder(100000);
		testSumDoublePrimitive test3 = new testSumDoublePrimitive(1000000000,500000);
		testSumDouble test4 = new testSumDouble(1000000000,500000);
		testSumBigDecimal test5 = new testSumBigDecimal(1000000000,500000);
		
		/* get Tasktimer */
		
		TaskTimer timer = TaskTimer.getTaskTimer();
		
		/* run tasks and print results */
		
		timer.measureAndPrint(task1);
		timer.measureAndPrint(task2);
		timer.measureAndPrint(test3);
		timer.measureAndPrint(test4);
		timer.measureAndPrint(test5);
	}
}