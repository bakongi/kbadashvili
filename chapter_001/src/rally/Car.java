package rally;
/**
*/
public class Car {

	private float gas = 0;
	private float rashodna100km = (float) 0.12;
	/**
	*/
	public void drive(int value) {
		this.gas = this.gas - (((float) value) * rashodna100km);
	}
	/**
	*/
	public void drive(double value) {
		this.gas = this.gas - (((float) value) * rashodna100km);
	}
	/**
	*/
	public void fill(int value) {
		this.gas = (float)value;
	}
	/**
	*/
	public void showGas() {
		System.out.println("Gas: " + this.gas);
	}
}