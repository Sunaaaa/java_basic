package workshop_polymorphism;

public class Department extends Evaluation{
	private String name;
	private Evaluation evaluation;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String name, double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		super();
		evaluation = new Evaluation();
		this.name = name;
		this.setEvaluationA(evaluationA);
		this.setEvaluationB(evaluationB);
		this.setEvaluationC(evaluationC);
		this.setEvaluationD(evaluationD);
		this.setEvaluationE(evaluationE);
		
	}
	
	public double evaluationNumber() {
		double a = evaluation.getEvaluationA()+evaluation.getEvaluationB();
		double b = evaluation.getEvaluationC()+evaluation.getEvaluationD();
		double c = evaluation.getEvaluationE();
		
		return (55/100*(a/2))+(25/100*(b/2))+(20/100*c);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Evaluation getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	
	
	
}
