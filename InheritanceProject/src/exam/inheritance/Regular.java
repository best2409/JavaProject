package exam.inheritance;

public class Regular extends Employee {
	private int salary;
	
	public Regular() {
		super("Lee", 20, "Inchon", "HR");
		this.salary = 20000;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("정규직!");
		super.printInfo();
	}
}
