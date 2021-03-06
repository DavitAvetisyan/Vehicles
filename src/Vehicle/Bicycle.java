package Vehicle;

/*
 * subclass of the vehicle class where the abstract methods 
 * setting and getting the number of wheels are implemented
 * 
 */
public class Bicycle extends Vehicle {
	private int numberOfWheels;

	/*
	 * Sets the number of wheels of the bicycle
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		if (numberOfWheels > 0) {
			this.numberOfWheels = numberOfWheels;
		} else {
			System.out.println("Number of wheels must be a positive number");
			this.numberOfWheels = 0;

		}
	}

	/*
	 * Returns the number of wheels of the bicycle
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
}
