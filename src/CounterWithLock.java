import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * AddTask by using ReentrantLock.
 * 
 * @author Napasai Sutthichutipong
 *
 */
public class CounterWithLock extends Counter {

	private Lock lock = new ReentrantLock();

	/** Add an amount to total. */
	public void add(int amount) {
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}

	}

}
