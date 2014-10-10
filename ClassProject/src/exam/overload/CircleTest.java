package exam.overload;

/*
 * 4. Method Overload
 * - 메소드명은 같으나, 기능을 달리할 때 사용하는 방법 
 * - 메소드명과 리턴타입은 일치, 매개변수의 타입, 개수, 순서를 다르게 하여 호출시 바인딩!
 * 
 * Class : Circle
 * Field : 반지름(radius), 색(color), 테두리(border)
 * Method : 1. getter/setter
 * 			2. drawCircle() #1 - 반지름 : 10.0, 색 : "black", 테두리 : 10
 * 			3. drawCircle() #2 - 반지름, 색 : "black", 테두리 : 10
 * 			4. drawCircle() #3 - 반지름, 색, 테두리 : 10
 * 			5. drawCircle() #4 - 반지름, 색, 테두리
 */

class Circle {
	// Field ---------------------------------
	private double radius;
	private String color;
	private int border;
	
	// getter/setter ---------------------------------
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
	public int getBorder() {
		return border;
	}
	public void setBorder(int border) {
		this.border = border;
	}
	
	// Method Overloading ---------------------------------
	// Method drawCircle() #1
	public void drawCircle() {
		this.radius = 10.0;
		this.color = "black";
		this.border = 10;
		
		System.out.println("drawCircle() #1 Radius : " + this.radius + ", Color : " + this.color + ", Border : " + this.border);
	}
	
	// Method drawCircle() #2
	public void drawCircle(double radius) {
		this.radius = radius;
		this.color = "black";
		this.border = 10;
		
		System.out.println("drawCircle() #2 Radius : " + this.radius + ", Color : " + this.color + ", Border : " + this.border);
	}
	
	// Method drawCircle() #3
	public void drawCircle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		this.border = 10;
		
		System.out.println("drawCircle() #3 Radius : " + this.radius + ", Color : " + this.color + ", Border : " + this.border);
	}
	
	// Method drawCircle() #4
	public void drawCircle(double radius, String color, int border) {
		this.radius = radius;
		this.color = color;
		this.border = border;
		
		System.out.println("drawCircle() #4 Radius : " + this.radius + ", Color : " + this.color + ", Border : " + this.border);
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		c1.drawCircle();					// Method drawCircle() #1 호출 
		
		Circle c2 = new Circle();
		c2.drawCircle(20.0);				// Method drawCircle() #2 호출 
		
		Circle c3 = new Circle();
		c3.drawCircle(30.0, "red");			// Method drawCircle() #3 호출 
		
		Circle c4 = new Circle();
		c4.drawCircle(40.0, "blue", 2);		// Method drawCircle() #4 호출 

	}

}
