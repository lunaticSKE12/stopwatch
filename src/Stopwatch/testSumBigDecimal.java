package Stopwatch;

import java.math.BigDecimal;

/**
* testSumBigDecimal add BigDecimal objects from an array.
* @author Napong Dungduangsasitorn
*
*/

public class testSumBigDecimal implements Runnable{

	/* array of values */
	
	private BigDecimal[] values;

	/* number times of summation */
	
	private int counter;
	
	/* summation of values */
	
	private BigDecimal sum;
	
	/**
	 * Constructor create array of values to add, before we start the timer,
	 * create BigDecimal for summation.
	 * @param counter number of times of summation.
	 * @param ARRAY_SIZE size of array that use to test.
	 */
	public testSumBigDecimal(int counter, int ARRAY_SIZE){
		sum = new BigDecimal(0.0);
		this.values = new BigDecimal[ARRAY_SIZE];
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	/**
	 * run the task
	 */

	@Override
	public void run() {
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * toString print string result.
	 * @return String show what task
	 */
	
	public String toString(){
		return String.format("Sum array of BigDecimal with count = %,d\nsum = %E",counter,sum);
	}
}
