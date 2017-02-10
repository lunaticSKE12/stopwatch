package Stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Napong Dungduangsasitorn
 * @version 1.0
 *
 */
public class Stopwatch {
	
	/* constant for converting nanoseconds to seconds.  */
	
	private static final double NANOSECONDS = 1.0E-9;
	
	/* time that the stopwatch was started, in nanoseconds. */
	
	private long startTime;
	
	/* time that the stopwatch was stopped, in nanoseconds. */
	
	private long stopTime;
	
	/* boolean that the stopwatch was running or not. */
	private boolean running;
	
	/**
	 *  Start the Stopwatch if it is not already running. 
	*/
	
	public Stopwatch(){
		this.running = false;
	}
	
	/**
	 * getElapsed compute time elapsed
	 * @return if stopwatch is running return elapsed time since start until the current time
	 * if stopwatch is stopped return the time between start and stop times
	 */
	
	public double getElapsed(){
		
		if(running){
			return (System.nanoTime() - this.startTime) * this.NANOSECONDS;
		}
		
		return (this.stopTime - this.startTime) * this.NANOSECONDS;
	}
	
	/**
	 * @return  true if the stopwatch is running, false if stopwatch is stopped. 
	 */
	
	public boolean isRunning(){

		return this.running;
		
	}
	
	/**
	 *  reset the stopwatch and start if if stopwatch is not running.  
	 *  If the stopwatch is already running then start does nothing. 
	 */
	
	public void start(){
		if(!isRunning()){
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	
	/**
	 *  stop the stopwatch.  If the stopwatch is already stopped, 
	 *  then stop does nothing. 
	 */
	
	public void stop(){
		if(isRunning()){
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}
}
