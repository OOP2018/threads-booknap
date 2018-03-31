import java.util.concurrent.atomic.AtomicLong;

/**
 * AddTask by using AtomicLong.
 * 
 * @author Napasai Sutthichutipong
 *
 */
public class AtomicCounter extends Counter {

	private AtomicLong total;

	/** Initialize the program. */
	public AtomicCounter() {
		total = new AtomicLong();
	}

	/** Add an amount to total. */
	public void add(int amount) {
		total.getAndAdd(amount);
	}

	/** Get the total value of counter. */
	public long get() {
		return total.longValue();
	}

}
