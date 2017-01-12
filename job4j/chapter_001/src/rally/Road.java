package rally;
/**
*/
public class Road {
	/**
	*/
	public static void main(String[] args) {
		Car car = new Car();
		car.fill(24);
		car.showGas();
		car.drive(100);
		car.showGas();
		Road.gasStation(car);
		car.showGas();
	}

	public static void gasStation(Car car) {
		car.fill(100);
	}
}