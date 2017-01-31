package Stopwatch;

/**
* testSumDoublePrimitive add double primitives from an array.
* @author Napong Dungduangsasitorn
*
*/

public class testSumDoublePrimitive implements Runnable{
	
	/* array of values */
	
	private double[] values;
	
	/* number times of summation */
	
	private int counter;
	
	/* summation of values */
	
	private double sum = 0.0;
	
	/**
	 * Constructor create array of values to add before we start the timer.
	 * @param counter number of times of summation.
	 * @param ARRAY_SIZE size of array that use to test.
	 */
	
	public testSumDoublePrimitive(int counter, int ARRAY_SIZE){
		this.counter = counter;
		values = new double[ARRAY_SIZE];
		for(int k = 0 ; k < ARRAY_SIZE ; k++) values[k] = k+1;
	}

	/**
	 * run the task
	 */
	
	@Override
	public void run() {
		
		// count = loop counter, i = array index value
		
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
		
	}
	
	/**
	 * toString print string result.
	 * @return String show what task
	 */
	
	public String toString(){
		return String.format("Sum array of double primitives with count = %,d\nsum = %E",counter, sum);
	}

}
