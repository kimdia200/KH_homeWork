package mobile;

public class Ltab extends Mobile{

	
	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		super.setBatterySize(super.getBatterySize()-(time*10));
		return super.getBatterySize();
	}

	@Override
	public int charge(int time) {
		super.setBatterySize(super.getBatterySize()+(time*10));
		return super.getBatterySize();
	}
}
