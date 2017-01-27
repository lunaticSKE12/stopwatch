
public class Stopwatch {
	
	private static final double NANOSECONDS = 1.0E-9;
	
	private long startTime;
	
	private long stopTime;
	
	private boolean running;
	
	public Stopwatch(){
		this.running = false;
	}
	
	
	public double getElapsed(){
		
		if(running){
			return (System.nanoTime() - this.startTime) * this.NANOSECONDS;
		}
		
		return (this.stopTime - this.startTime) * this.NANOSECONDS;
	}
	
	public boolean isRunning(){

		return this.running;
		
	}
	
	public void start(){
		if(!isRunning()){
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	
	public void stop(){
		if(isRunning()){
			this.stopTime = System.nanoTime();
			this.running = false;
		}
		
		
	}

}
