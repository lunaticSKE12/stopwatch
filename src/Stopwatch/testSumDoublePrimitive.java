package Stopwatch;

public class testSumDoublePrimitive implements Runnable{
	
	private double[] values;
	
	private int counter;
	
	private double sum = 0.0;
	
	public testSumDoublePrimitive(int counter, int ARRAY_SIZE){
		this.counter = counter;
		values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
	}

	@Override
	public void run() {
		
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
		
	}
	
	public String toString(){
		return String.format("Sum array of double primitives with count = " + counter + "\nsum = " + sum);
	}

}
