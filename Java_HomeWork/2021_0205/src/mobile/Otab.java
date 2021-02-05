package mobile;

public class Otab extends Mobile{
	
	
	public Otab() {
		super();
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		super.setBatterySize(super.getBatterySize()-(time*12));
		return super.getBatterySize();
	}

	@Override
	public int charge(int time) {
		super.setBatterySize(super.getBatterySize()+(time*8));
		return super.getBatterySize();
	}
}
