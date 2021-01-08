package ncs.test9;

public class Cargoplane extends Airplane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	@Override
	public void flight(int distance) {
		refuel(-(distance/10)*50);
	}
	
}
