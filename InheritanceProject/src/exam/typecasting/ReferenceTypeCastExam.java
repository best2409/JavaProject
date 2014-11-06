package exam.typecasting;

/**
 * @author N.Y Lee
 * 1. Type Cast 유형
 * - 상향 형변환(UpCating) : 자동 형변환(형변환 연산 생략가능)
 * - 하향 형변환(DownCasting) : 강제 형변환(형변환 연산 생략불가)
 * 
 * 2. Type Cast 상세내용 
 * - Primitive Type(기본형)간 형변환 : boolean을 제외하고 서로 형변환 가능 
 * - Reference Type(참조형)간 형변환 : 상속관계인 경우에만 형변환 가능 
 * - Primitive Type과 Reference 간 형변환 : Wrapper Class(Boolean, Character, Byte, Short, Integer, Long, Float, Double)
 * 
 * 3. Reference Type(기본형)간 형변환
 * - 상항 형변환(UpCasting) : 자식 클래스 타입을 부모 클래스 타입으로 형변환, 생략가능 
 * - 하향 형변환(DownCasting) : 부모 클래스 타입을 자식 클래스 타입으로 형변환, 생략불가 
 * 
 * 4. instanceof 연산자 -> boolean(true/false)
 * - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보는 연산자 
 */


// 부모 클래스
class Parent {
	private String name;
	
	public void parentMethod() {
		System.out.println("Parent Method");
	}
	
	public void inheritMethod() {
		System.out.println("Parent - Inheritance Method");
	}
}


// 자식 클래스 
class Child extends Parent {
	
	public void childMethod() {
		System.out.println("Child Method");
	}
	
	@Override
	public void inheritMethod() {
		System.out.println("Child - Inheritance Method");
	}
}

public class ReferenceTypeCastExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 참조형 형변환 
		 * 1) 상향 형변환(UpCasting) : 자식(Child) -> 부모(Parent)
		 * 2) 하향 형변환(DownCasting) : 부모(Parent) -> 자식(Child)
		 * 3) instanceof 연산자 
		 */
		
		// 1) 자식 -> 부모  -------------------------------------
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1 = c1; // p1 = (Parent) c1, 형변환 연산 생략 가능
		p1.parentMethod();
		// p1.childMethod();
		p1.inheritMethod();
		
		
		// 2) 부모 -> 자식  -------------------------------------
		Parent p2 = new Parent();
		Child c2 = new Child();
		
		c2 = (Child) p1;
		
		c2.parentMethod();
		c2.childMethod();
		c2.inheritMethod();
		
		// 3) instanceof  -------------------------------------
		Parent p3 = new Parent();
		Child c3 = new Child();
		
		Parent p4 = new Child();
		
		if(p3 instanceof Parent) {
			System.out.println("p3는 Parent Class");
		}
		
		if(c3 instanceof Parent) {
			System.out.println("c3는 Parent SubClass");
		}
		
		if(c3 instanceof Child) {
			System.out.println("c3는 Child Class");
		}
		
		if(c3 instanceof Object) {
			System.out.println("c3는 Object Sub Class");
		}
		
		if(p4 instanceof Parent) {
			System.out.println("p4는 Parent Class");
		}
		
		if(p4 instanceof Child) {
			System.out.println("p4는 Child Class");
		}
		
	}

}
