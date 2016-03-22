package Vehicle;

/**
 * subclass of the vehicle class where the abstract methods 
 * setting and getting the number of wheels are implemented
 * Also, the door lock status is set and returned.
 * 
 * @author Davo
 */
public class Car extends Vehicle {
	private int numberOfWheels;
	private boolean doorLockState;

	/*
	 * Returns the number of wheels of the car
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/*
	 * Sets the number of wheels of the car
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		if (numberOfWheels > 2) {
			this.numberOfWheels = numberOfWheels;
		} else {
			System.out
					.println("The number of wheels for cars must be greater than 2");
			this.numberOfWheels = 0;
		}
	}

	/*
	 * Prints the door lock status
	 */
	public void isDoorLocked() {
		if (doorLockState) {
			System.out.println("Doors are locked");
		} else {
			System.out.println("Doors are not locked");
		}
	}

	/*
	 * Sets doors of the car locked or unlocked
	 */

	public void setDoorLocked(boolean doorLockState) {
		this.doorLockState = doorLockState;
	}

}
