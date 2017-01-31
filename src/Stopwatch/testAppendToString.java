package Stopwatch;

/**
 * testAppendToString append chars to a string.
 * @author Napong Dungduangsasitorn
 *
 */
public class testAppendToString implements Runnable{
	
	/* constant char */
	
	private static final char CHAR = 'a';
	
	/* number of times that string append */
	
	private int count;
	
	/**
	 * constructor 
	 * @param count number of times that string append 
	 */
	
	public testAppendToString(int count){
		this.count = count;
	}

	/**
	 * run the task 
	 */
	
	@Override
	public void run() {
		String result = "";
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	/**
	 * toString print string result.
	 * @return String show what task
	 */
	
	public String toString(){
		return String.format("Append %,d chars to String\nfinal string length = %,d", count, count);
	}
	

}
