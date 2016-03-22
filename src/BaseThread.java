import java.io.IOException;

/**
 * Waits for an input into the console then changes the boolean value which then
 * interrupts the while loop in the main method
 * 
 * @author Davo
 * 
 */
public class BaseThread extends Thread {

	@Override
	public void run() {
		try {

			System.in.read();
			ThreadExample.bool = false;
		} catch (IOException e) {
			currentThread().interrupt();
		}
	}

}
