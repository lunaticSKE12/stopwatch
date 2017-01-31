package Stopwatch;

/**
* testAppendToStringBuilder append chars to a StringBuilder.
* @author Napong Dungduangsasitorn
*
*/

public class testAppendToStringBuilder implements Runnable{
	
	/* constant char */
	
	private static final char CHAR = 'a';

	/* number of times that string append */
	
	private int count;
	
	/**
	 * constructor 
	 * @param count number of times that StringBuilder append 
	 */
	
	public testAppendToStringBuilder(int count){
		this.count = count;
	}
	
	/**
	 * run the task 
	 */

	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
	}

	/**
	 * toString print string result.
	 * @return String show what task
	 */
	
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %,d", count, count); 
	}
}
