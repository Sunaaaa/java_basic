package workshop_polymorphism.car;

public class L5 extends Car implements Temp{
	
	public L5() {
		super();
	}
	
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		super.setDistant(super.getDistant()-distance);
	}
	@Override
	public void setOil(int oilSize) {
		// TODO Auto-generated method stub
		super.setOil(super.getOilSize()-oilSize);
	}
	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		int a = super.getDistant()/10;
		return a*2;
	}
}
