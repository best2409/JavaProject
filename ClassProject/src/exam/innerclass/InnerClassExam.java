package exam.innerclass;


/*
 * 6. Inner Class(내부 클래스)
 * - 하나의 클래스 안에 다른 클래스를 정의
 * - 필드, 메소드와 마찬가지로 내부 클래스도 멤버로 인정, private로 선언되어 있는 멤버도 내부 클래스는 참조 가능!
 */

class OuterClass {
	private String outerField = "out";
	
	public OuterClass() {
		System.out.println("Outer Class Constructor");
		InnerClass ic = new InnerClass();
		ic.print();
	}
	
	public class InnerClass {
		private String innerField = "in";
		
		public InnerClass() {
			System.out.println("Inner Class Constructor");
		}
		
		public void print() {
			System.out.println("Inner Class print()");
			
			System.out.println("OuterField : " + outerField);  // 가능!
		}
	}
	
	public void print() {
		System.out.println("Outer Class print()");
		
		// System.out.println("InnerField : " + innerField);   // 불가능!
	}
}

public class InnerClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		
		oc.print();
	}

}
