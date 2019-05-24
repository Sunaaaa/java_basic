package workshop_polymorphism;

public class Evaluation {
	private double evaluationA;
	private double evaluationB;
	private double evaluationC;
	private double evaluationD;
	private double evaluationE;
	
	public Evaluation() {
		// TODO Auto-generated constructor stub
	}

	public Evaluation(double evaluationA, double evaluationB, double evaluationC, double evaluationD,
			double evaluationE) {
		super();
		this.evaluationA = evaluationA;
		this.evaluationB = evaluationB;
		this.evaluationC = evaluationC;
		this.evaluationD = evaluationD;
		this.evaluationE = evaluationE;
	}
	public double evaluationNumber() {
		double a = evaluationA+evaluationB;
		double b = evaluationC+evaluationD;
		double c = evaluationE;
		
		return (55/100*(a/2))+(25/100*(b/2))+(20/100*c);
	}

	public double getEvaluationA() {
		return evaluationA;
	}

	public void setEvaluationA(double evaluationA) {
		this.evaluationA = evaluationA;
	}

	public double getEvaluationB() {
		return evaluationB;
	}

	public void setEvaluationB(double evaluationB) {
		this.evaluationB = evaluationB;
	}

	public double getEvaluationC() {
		return evaluationC;
	}

	public void setEvaluationC(double evaluationC) {
		this.evaluationC = evaluationC;
	}

	public double getEvaluationD() {
		return evaluationD;
	}

	public void setEvaluationD(double evaluationD) {
		this.evaluationD = evaluationD;
	}

	public double getEvaluationE() {
		return evaluationE;
	}

	public void setEvaluationE(double evaluationE) {
		this.evaluationE = evaluationE;
	}
	
}
