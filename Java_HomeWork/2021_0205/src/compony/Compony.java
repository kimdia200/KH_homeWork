package compony;

public class Compony {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	public Compony() {
		super();
	}
	public Compony(double salary) {
		super();
		this.salary = salary;
		annualIncome = salary*12;
		bonus=salary*0.2;
		afterTaxBonus=bonus*4*0.945;
	}
	
	public double getIncome() {
		return annualIncome;
	}
	public double getAfterTaxIncome() {
		return annualIncome*0.9;
	}
	public double getBonus() {
		return bonus*4;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}
	public double getTotal() {
		return getAfterTaxIncome()+getAfterTaxBonus();
	}
}
