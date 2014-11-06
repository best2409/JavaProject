package exam.inheritance;

public class Temporary extends Employee {
	private int time;
	private int pay;
	
	public Temporary() {
		super("kim", 10, "Sungnam", "RD");
	}
	
	public void printInfo() {
		System.out.println("비정규직!");
		super.printInfo();
		System.out.println("Time : " + this.time);
		System.out.println("Pay : " + this.pay);
		System.out.println("Time * Pay : " + this.time * this.pay);
	}
}
