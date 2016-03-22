import java.util.Random;

/**
 * Based on the same random number used in ThreadA, this thread prints in its
 * turn.
 * 
 * @author Davo
 * 
 */
public class ThreadB extends Thread {

	int randomvalue;

	public ThreadB(int x) {
		// TODO Auto-generated constructor stub
		this.randomvalue = x;
	}

	/*
	 * Prints "I say good bye" or "I say good night" based on a random number
	 * generated.
	 */
	public void run() {

		if (randomvalue == 0) {
			System.out.println("I say good bye");
		} else {
			System.out.println("I say good night");
		}

	}
}
