package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		refuel(-(distance/10)*30);
	}
		
}
