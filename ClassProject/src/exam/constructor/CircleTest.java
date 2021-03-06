package exam.constructor;

/*
 * 3. Constructor, Constructor Overload ------------------------
 * - Constructor : 객체 생성시 자동호출되며, 초기화 목적으로 사용하는 Method
 *               : 클래스명과 이름 일치, 리턴타입 자체가 없음 
 * - Constructor Overload : 매개변수의 개수, 타입, 순서가 다르게 하여 객체 생성시 여러가지의 초기화를 실행시킬 수 있음!
 * - this() : 지금 실행되고 있는 객체의 다른 생성자 호출 
 * - this : 지금 실행되고 있는 객체를 가르키는 참조변수 
 * 
 * 예제-------------------------------------------------------------------------------
 * Class : Circle
 * Field : 반지름(radius), 색(color)
 * Constructor : 1. 반지름 : 10.0, 색 : "red"   -> this() 이
 * 				 2. 매개변수 : 반지름
 * 				 3. 매개변수 : 색
 * 				 4. 매개변수 : 반지름, 색 
 * Method : 1. getter/setter
 * ---------------------------------------------------------------------------------
 */

class Circle {
	private double radius;
	private String color;
	
	// Constructor #1
	 public Circle() {
		 /*this.radius = 10.0;
		 this.color = "red";*/
		 
		 this(10.0, "red");     // Constructor #4 호출!
	 }
	 
	// Constructor #2
	 public Circle(double radius) {
		 this.radius = radius;
	 }
	 
	// Constructor #3
	 public Circle(String color) {
		 this.color = color;
	 }
	 
	// Constructor #4
	 public Circle(double radius, String color) {
		 this.radius = radius;
		 this.color = color;
	 }

	// getter/setter ------------------------------------------------------------------
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}


public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constructor
		Circle c1 = new Circle();						// Constructor #1
		Circle c2 = new Circle(10.0);					// Constructor #2
		Circle c3 = new Circle("black");				// Constructor #3
		Circle c4 = new Circle(20.0, "white");			// Constructor #4
		
		System.out.println("Constructor #1 : " + c1.getRadius());
		System.out.println("Constructor #1 : " + c1.getColor()); 
		
		System.out.println("Constructor #2 : " + c2.getRadius()); 
		System.out.println("Constructor #2 : " + c2.getColor()); 
		
		System.out.println("Constructor #3 : " + c3.getRadius()); 
		System.out.println("Constructor #3 : " + c3.getColor()); 
		
		System.out.println("Constructor #4 : " + c4.getRadius()); 
		System.out.println("Constructor #4 : " + c4.getColor()); 
	}

}
