package Stopwatch;

/**
* testSumDouble add Double objects from an array.
* @author Napong Dungduangsasitorn
*
*/

public class testSumDouble implements Runnable{
	
	/* array of values */
	
	private Double[] values;
	
	/* number times of summation */
	
	private int counter;

	/* summation of values */
	
	private Double sum = new Double(0.0);
	
	/**
	 * Constructor create array of values to add, before we start the timer
	 * @param counter number of times of summation.
	 * @param ARRAY_SIZE size of array that use to test.
	 */
	
	public testSumDouble(int counter, int ARRAY_SIZE){
		this.values = new Double[ARRAY_SIZE];
		this.counter = counter;
		for(int i = 0 ; i < ARRAY_SIZE ; i++) values[i] = new Double(i + 1);
		
	}

	/**
	 * run the task
	 */
	
	@Override
	public void run() {
		
		// count = loop counter, i = array index
		for(int count = 0 , i = 0 ; count < counter ; count++ , i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * toString print string result.
	 * @return String show what task
	 */
	
	public String toString(){
		return String.format("Sum array of Double objects with count = %,d\nsum = %E",counter, sum);
	}
}
