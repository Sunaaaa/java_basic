package workshop_polymorphism.mobile;

abstract public class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public int operation(int time) {
		this.batterySize -= (time*10);
		return this.getBatterySize();
	}
	public int charge(int time) {
		this.batterySize += (time*10);
		return this.batterySize+(time*10);
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	
}

