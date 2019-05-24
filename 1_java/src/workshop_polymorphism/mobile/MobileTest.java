package workshop_polymorphism.mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		System.out.println(ltab.getBatterySize());
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("----------------------------------");
		System.out.printf("%s \t %d \t %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s \t %d \t %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

		ltab.charge(10);
		otab.charge(10);

		System.out.println("10분 충전");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("----------------------------------");
		System.out.printf("%s \t %d \t %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s \t %d \t %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

		ltab.operation(5);
		otab.operation(5);

		System.out.println("5분 통화");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("----------------------------------");
		System.out.printf("%s \t %d \t %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s \t %d \t %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

	}

}
