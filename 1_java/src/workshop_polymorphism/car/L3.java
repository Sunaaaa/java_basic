package workshop_polymorphism.car;

public class L3 extends Car implements Temp{

	public L3() {
	}
	
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	
	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		int a = super.getDistant()/10;
		return a*2;	}
}
