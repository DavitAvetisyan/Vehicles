package Vehicle;

/**
 * This is used to control for garage sizes and assign integer values to each
 * size of the garage
 */
public enum GarageSize {
	SMALL(5), MEDIUM(12), LARGE(20);

	private final int s;

	private GarageSize(int s) {
		this.s = s;
	}

	public int getS() {
		return s;
	}
}