package Vehicle;

import java.util.Calendar;

/**
 * 
 * 
 * This is an abstract class where most of the methods assigning parameters to
 * the vehicles are implemented.
 */
public abstract class Vehicle {

	int year = Calendar.getInstance().get(Calendar.YEAR);
	private Motor motor;
	private String brandName;
	private int productionDate;
	private int maxSpeed;
	private int currentSpeed;

	/*
	 * Abstract method which returns the number of wheels of a vehicle
	 */
	public abstract int getNumberOfWheels();

	/*
	 * Abstract method which sets the number of wheels of a vehicle
	 */
	public abstract void setNumberOfWheels(int numberOfWheels);

	/*
	 * motor constructor
	 */
	public Vehicle() {
		motor = new Motor();
	}

	/*
	 * Returns vehicle brand name
	 */
	public String getBrandName() {
		return brandName;
	}

	/*
	 * sets vehicle brand name
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/*
	 * Returns the engine if the vehicle has one
	 */
	public Motor getMotor() {
		return motor;
	}

	/*
	 * Returns production date of the vehicle
	 */
	public int getProductionDate() {
		return productionDate;
	}

	/*
	 * Sets production date of the vehicle
	 */
	public void setProductionDate(int productionDate) {
		if (productionDate <= year && productionDate > 0) {
			this.productionDate = productionDate;
		} else {
			System.out
					.println("Production date should be positive number, less than or equal to current year.");
			this.productionDate = -999;
		}
	}

	/*
	 * Returns maximum speed of the vehicle
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/*
	 * Sets maximum speed of the vehicle
	 */
	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 0) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out
					.println("Maximum speed should be an integer greater than zero.");
			this.maxSpeed = -999;
		}

	}

	/*
	 * Returns the current speed of the vehicle
	 */
	public void getCurrentSpeed() {
		System.out.print("Current speed of the vehicle is: " + currentSpeed);
		;
	}

	/*
	 * Sets the current speed of the vehicle
	 */
	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed >= 0 && currentSpeed <= maxSpeed) {
			this.currentSpeed = currentSpeed;
		} else {
			System.out
					.println("Current speed should be an integer from zero to maximum speed of the car, inclusive.");
			this.currentSpeed = -999;
		}

	}

	/*
	 * accelerates the vehicle speed by given amount
	 */
	public void accelerate(int speed) {
		if (this.currentSpeed + speed <= maxSpeed && speed > 0) {
			this.currentSpeed += speed;
		} else {
			System.out
					.println("The vehicle cannot accelerate with the given speed");
		}
	}

	/*
	 * Fully breaks the speed of the vehicle
	 */
	public void breakSpeed() {
		setCurrentSpeed(0);
	}

	/*
	 * breaks the speed of the vehicle by the given amount
	 */
	public void breakSpeed(int speed) {
		if (speed > 0 && this.currentSpeed - speed >= 0) {
			setCurrentSpeed(this.currentSpeed - speed);
		} else {
			System.out
					.println("The vehicel cannot break with the given amoout");
		}
	}

}
