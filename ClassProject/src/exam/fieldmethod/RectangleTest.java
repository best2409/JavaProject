package exam.fieldmethod;

/*
 * 1. Field, Method
 * - 클래스의 구성요소 : Field(=필드=변수=속성), Method(=함수) => 캡슐화 
 * - Field : 데이터 저장하기 위한 구성요소 
 *  	   : "접근제어자 데이터타입 필드명;"으로 선언 -> private으로 선언하여 외부에 노출되지 않게 하는 것이 데이터 무결성을 위해 좋음!(정보은닉)
 * - Method : 데이터를 처리하기 위한 구성요소 
 * 		    : "리턴데이터타입 메소드명(매개변수들...) { }"로 정의 -> 외부에서 호출해야지만 실행!
 * 
 * 예제---------------------------------------------------------
 * Class : Rectangle
 * Field : 가로(width), 세로(height)
 * Method : 1. getter/setter
 * 			2. getArea() - 면적 계산 후 반환  
 * 			3. getPerimeter() - 둘레 계산 후 반환 
 * ------------------------------------------------------------
 */

class Rectangle {
	// Field ---------------------------------------------
	private int width;
	private int height;
	
	// getter/setter ----------------------------------------
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	// Method ---------------------------------------------
	// 면적 계산 
	public int getArea() {
		return this.width * this.height;
	}
	
	// 둘레 계산 
	public int getPerimeter() {
		return (this.width + this.height) * 2;
	}
	
}

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 	Test
		 *  1) Rectangle 객체 생성
		 *  2) getArea 메소드 이용하여 면적 계산 
		 *  3) getPerimeter 메소드 이용하여 둘레 계산 
		*/
		
		Rectangle r = new Rectangle();
		r.setWidth(10);
		r.setHeight(20);
		
		int area = r.getArea();
		System.out.println("Area : " + area);
		
		int perimeter = r.getPerimeter();
		System.out.println("Perimeter : " + perimeter);
				

	}

}
