import java.util.Random;

/**
 * This class creates three threads, two of which print one after another based
 * on what the first one randomly prints. All threads are interupted and
 * terminated after something is typed on the console.
 * 
 * @author Davo
 * 
 */
public class ThreadExample {
	public static boolean bool = true;

	public static void main(String[] args) {
		Random ran = new Random();
		new BaseThread().start();

		while (bool) {
			int x = ran.nextInt(2);
			ThreadA threadA = new ThreadA(x);
			ThreadB threadB = new ThreadB(x);
			threadA.start();

			try {
				threadA.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				threadA.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			threadB.start();
			try {
				threadB.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
