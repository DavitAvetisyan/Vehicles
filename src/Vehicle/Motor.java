package Vehicle;

import util.Constants;

/*
 * This class creates the engine of the vehicle and 
 * includes all the methods applied to the engine
 */
public class Motor {

	private int horsePower;
	private String fuelType;
	private String motorWorkingState;

	/*
	 * Returns motor's horsepower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/*
	 * Sets motor's horsepower
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	/*
	 * Setting the type of fuel the engine operates with Two types are allowed:
	 * PETROL or BATTERY
	 */
	public void setFuelType(String fuel) {
		if (fuel.equals(Constants.PETROL) || fuel.equals(Constants.BATTERY)) {
			this.fuelType = fuel;
		} else {
			System.out
					.println("For fuel type, please, select either PETROL or BATTERY");
		}
	}

	/*
	 * Returns fuel type
	 */
	public String getFuelType() {
		return fuelType;
	}

	/*
	 * Sets working condition of the engine, Boolean- True means working, False
	 * means not working
	 */
	public void setMotorWorkingState(boolean state) {
		if (state) {
			this.motorWorkingState = "working";
		} else {
			this.motorWorkingState = "not working";
		}
	}

	/*
	 * Returns the working condition of the engine
	 */
	public String getMotorWorkingState() {
		return motorWorkingState;
	}

}
