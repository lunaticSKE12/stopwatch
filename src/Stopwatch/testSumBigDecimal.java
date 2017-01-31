package Stopwatch;

import java.math.BigDecimal;

public class testSumBigDecimal implements Runnable{
	
	private BigDecimal[] values;
	
	private int counter;
	
	private BigDecimal sum = new BigDecimal(0.0);;
	
	public testSumBigDecimal(int counter, int ARRAY_SIZE){
		this.values = new BigDecimal[ARRAY_SIZE];
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	

	@Override
	public void run() {
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		
	}
	
	public String toString(){
		
		return String.format("Sum array of BigDecimal with count = %,d\nsum = %d",counter,sum);
	}

}
