package ncs.test10;

public class Sales extends Employee implements Bonus{

	public Sales() {
		super();
	}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+(int)(pay*1.2));
	}

	@Override
	public double tax() {
		return getSalary()*0.13;
	}
}
	
	