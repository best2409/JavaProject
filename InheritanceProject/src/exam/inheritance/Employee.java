package exam.inheritance;


/**
 * 
 * @author NY
 * @since 2014.10.17
 *
 */

public class Employee {
	private String name;
	private int age;
	private String addr;
	private String dept;
	
	public Employee() {
		this.name = "Hong";
		this.age = 20;
		this.addr = "Seoul";
		this.dept = "IT";
	}
	
	public Employee(String name, int age, String addr, String dept) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Addr : " + this.addr);
		System.out.println("Dept : " + this.dept);
	}
}
