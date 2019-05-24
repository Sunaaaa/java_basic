package workshop_polymorphism.car;

abstract public class Car {
	
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distant;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distant) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distant = distant;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistant() {
		return distant;
	}

	public void setDistant(int distant) {
		this.distant = distant;
	}

	public void go(int distance) {};
	public void setOil(int oilSize) {};
	
}
