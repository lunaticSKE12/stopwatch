package Stopwatch;

public class testAppendToString implements Runnable{
	
	private static final char CHAR = 'a';
	private int count;
	
	public testAppendToString(int count){
		this.count = count;
	}

	@Override
	public void run() {
		String result = "";
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	public String toString(){
		return String.format("Append %,d chars to String\nfinal string length = %,d", count, count);
	}
	

}
