package ncs.test10;

public class Company {
	public static void main(String[] args) {
		Company c = new Company();
		Employee[] employees = new Employee[2];
		employees[0]=new Secretary("Hilery",1,"secretary",800);
		employees[1]=new Sales("Clinten",2,"sales",1200);
		System.out.println("name\tdepartment\tsalary\r\n" + 
				"------------------------------------");
		for(Employee e : employees) {
			System.out.printf("%-10s %-10s %5d\n",e.getName(),e.getDepartment(),e.getSalary());
		}
		
		System.out.println("인센티브 100 지급");
		for(Employee e : employees) {
			if(e instanceof Bonus)
				((Bonus) e).incentive(100);
		}
		System.out.println("name\tdepartment\tsalary\ttax\r\n" + 
				"------------------------------------");
		for(Employee e : employees) {
			System.out.printf("%-10s %-10s %5d %8.1f\n",e.getName(),e.getDepartment(),e.getSalary(),e.tax());
		}
		
	}
	public void bonus(Bonus b,int bb) {
		b.incentive(bb);
	}
}
	