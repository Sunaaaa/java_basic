package workshop_inheritance;

public class Company {
	private double salary;
	private double annualIncome;
	private double afterAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(int salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		return this.salary * 12;
	}
	public double getAfterAnnualIncome() {
		double a = this.getIncome() - this.getIncome()/10;
		return a;
	}
	public double getBonus() {
		this.bonus = ((this.salary * 20)/100)*4;
		return this.bonus;
	}
	public double getAfterTaxBonus() {
		double a = this.getBonus() - this.getBonus()/5.5-this.getBonus()%5.5;
		return a;
	}
	
	public void print() {
		System.out.printf("연 기본급 합 :  %.1f 세후 : %.1f %n", this.getIncome(), this.getAfterAnnualIncome());
		System.out.printf("연 보너스 합 : %.1f 세후 : %.1f %n", this.getBonus(), this.getAfterTaxBonus());
		System.out.printf("연 지급액 합 : %.1f %n",this.getAfterAnnualIncome() + this.getAfterTaxBonus());
	}
	
	
	
	
}
