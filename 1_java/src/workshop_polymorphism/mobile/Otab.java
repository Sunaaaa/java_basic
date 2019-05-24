package workshop_polymorphism.mobile;

public class Otab extends Mobile{
	public Otab() {
		// TODO Auto-generated constructor stub
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operation(int time) {
		// TODO Auto-generated method stub
		super.setBatterySize(super.getBatterySize()-(time*12));
		return super.getBatterySize();
	}
	
	@Override
	public int charge(int time) {
		// TODO Auto-generated method stub
		super.setBatterySize(super.getBatterySize()+(time*8));
		return super.getBatterySize();
	}
}
