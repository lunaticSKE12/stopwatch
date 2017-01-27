package Stopwatch;

public class testAppendToStringBuilder implements Runnable{
	
	private static final char CHAR = 'a';
	private int count;
	
	public testAppendToStringBuilder(int count){
		this.count = count;
	}

	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
	}

	
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\nfinal string length %,d", count, count); 
	}
}
