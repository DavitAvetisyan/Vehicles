package Vehicle;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is used to create a vehicle garage with custom size, add vehicles to the garage .
 * 
 */
public class VehicleGarage {
	private int vehicles;
	private List<String> vehicleList;

	/*
	 * This method creates garage with fixed sizes: SMALL, MEDIUM, LARGE.
	 */
	public VehicleGarage(String size) {
		vehicleList = new ArrayList<>();
		switch (size) {
		case "SMALL":
			this.vehicles = GarageSize.SMALL.getS();
			break;
		case "MEDIUM":
			this.vehicles = GarageSize.MEDIUM.getS();
			break;
		case "LARGE":
			this.vehicles = GarageSize.LARGE.getS();
			break;
		default:
			System.out
					.println("Error in VehicleGarage size: Use SMALL, MEDIUM or LARGE");
			this.vehicles = 0;
			break;
		}
	}

	/*
	 * With this method vehicles can be added to a garage.
	 */
	public boolean addVehicle(Vehicle vehicle) {
		boolean isFilled = false;
		if (vehicle instanceof Car) {
			isFilled = this.vehicles - 3 < 0 ? true : false;
			if (!isFilled) {
				this.vehicles -= 3;
				vehicleList.add("Car");
			}
		} else if (vehicle instanceof Motorcycle) {
			isFilled = this.vehicles - 2 < 0 ? true : false;
			if (!isFilled) {
				this.vehicles -= 2;
				vehicleList.add("Motorcycle");
			}
		} else if (vehicle instanceof Bicycle) {
			isFilled = this.vehicles - 1 < 0 ? true : false;
			if (!isFilled) {
				this.vehicles -= 1;
				vehicleList.add("Bicycle");
			}
		}

		if (isFilled) {
			System.out.println("There is no more space for chosen vehicle.");
		}

		return isFilled;
	}

	/**
	 * Get vehicle list
	 * @return
	 */
	public List<String> getVehicleList() {
		return vehicleList;
	}

	/**
	 * Get vehicle count
	 * @return
	 */
	public int getVehicles() {
		return vehicles;
	}

}
