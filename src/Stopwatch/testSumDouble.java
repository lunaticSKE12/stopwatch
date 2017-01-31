package Stopwatch;

public class testSumDouble implements Runnable{
	
	private Double[] values;
	
	private int counter;
	
	private Double sum = new Double(0.0);
	
	public testSumDouble(int counter, int ARRAY_SIZE){
		this.values = new Double[ARRAY_SIZE];
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		
	}

	@Override
	public void run() {
		
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}

	public String toString(){
		return String.format("Sum array of Double objects with count = " + counter + "\nsum = " + sum);
	}
}
