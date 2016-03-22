import java.util.Random;

/**
 * This thread randomly chooses what to print.
 * 
 * @author Davo
 * 
 */
public class ThreadA extends Thread {

	int randomvalue;

	public ThreadA(int x) {
		// TODO Auto-generated constructor stub
		this.randomvalue = x;
	}

	/*
	 * Prints "You say hello" or "You say good morning" based on a random number
	 * generated.
	 */
	public void run() {

		if (randomvalue == 0) {
			System.out.println("You say hello");
		} else {
			System.out.println("You say good morning");
		}
	}
}
