/**
 * AddTask adds number 1 ... limit to the counter, then exits.
 * 
 * @author Napasai Sutthichutipong
 * 
 */
public class AddTask implements Runnable {
	
	private Counter counter;
	private int limit;

	/** Initialize the program. */
	public AddTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/** Run the program. */
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(k);
		// If you want to see when a thread finishes, add this line:
		// System.out.println("Done "+Thread.currentThread().getName());
	}
}
