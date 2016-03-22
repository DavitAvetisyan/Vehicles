package Vehicle;

/** This class is used to create a vehicle garage, vehicles of type car, motorcycle and bicycle. 
 * The vehicles can be added to a particular garage which can contain limited number of vehicles.
 * To the vehicles can be assigned characteristics like brand name, number of wheels, production date, maximum speed, 
 * engine fuel type, horsepower and working state. The vehicles can accelerate and break with custom amounts and 
 * the current state of the speed can be checked.
 * Currently parked vehicle types, vehicle characteristics and the door lock status of the cars can be checked.
 * 
 */

public class Garage {

	public static void main(String[] args) {

		VehicleGarage h = new VehicleGarage("SMALL");
		Bicycle shkolnik = new Bicycle();
		Car bmw = new Car();
		setAllParameters(bmw, "BMW", 4, 2016, 200, "PETROL", 100, true);
		viewAllParameters(bmw);
		h.addVehicle(bmw);
		h.addVehicle(shkolnik);
		checkGarage(h);
		bmw.setDoorLocked(true);
		bmw.isDoorLocked();
		h.getVehicleList();
	}

	/*
	 * This method prints the types of the vehicles parked in the given garage
	 */
	public static void checkGarage(VehicleGarage vehicleGarage) {
		if (vehicleGarage != null) {
			System.out.println("Vehicle types parked in the garage:");
			for (String carType : vehicleGarage.getVehicleList()) {
				System.out.println(carType);
			}
			System.out.println();
		} else {
			System.out.println("No vehicles in this garage");
			System.out.println();
		}
	}

	/*
	 * This method can be used to set all the parameters of a given vehicle.
	 */
	public static void setAllParameters(Vehicle vehicle, String brandName,
			int numberOfWheels, int productionDate, int maxSpeed,
			String fuelType, int horsePower, Boolean motorWorkingState) {

		vehicle.setBrandName(brandName);
		vehicle.setNumberOfWheels(numberOfWheels);
		vehicle.setProductionDate(productionDate);
		vehicle.setMaxSpeed(maxSpeed);
		vehicle.getMotor().setFuelType(fuelType);
		vehicle.getMotor().setHorsePower(horsePower);
		vehicle.getMotor().setMotorWorkingState(motorWorkingState);

	}

	/*
	 * This method prints all the filled parameters of the given vehicle.
	 */
	public static void viewAllParameters(Vehicle vehicle) {

		System.out.println("Vehicle type:         "
				+ vehicle.getClass().getSimpleName());
		if (vehicle.getBrandName() != null) {
			System.out.println("Brand name:    	      "
					+ vehicle.getBrandName());
		}
		if (vehicle.getNumberOfWheels() != 0) {
			System.out.println("Number of wheels is:  "
					+ vehicle.getNumberOfWheels());
		}
		if (vehicle.getProductionDate() != 0) {
			System.out.println("Production date:      "
					+ vehicle.getProductionDate());
		}
		if (vehicle.getMaxSpeed() != 0) {
			System.out.println("Maximum speed:        " + vehicle.getMaxSpeed()
					+ "km/h");
		}
		if (vehicle.getMotor().getFuelType() != null) {
			System.out.println("Fuel type:            "
					+ vehicle.getMotor().getFuelType());
		}
		if (vehicle.getMotor().getHorsePower() != 0) {
			System.out.println("Engine horsepower:    "
					+ vehicle.getMotor().getHorsePower());
		}
		if (vehicle.getMotor().getMotorWorkingState() != null) {
			System.out.println("Engine working state: "
					+ vehicle.getMotor().getMotorWorkingState());
		}
		System.out.println();

	}

}
