package exam.fieldmethod;

/*
 * Field, Method
 * 
 * Class : Rectangle
 * Field : 가로(width), 세로(height)
 * Method : 1. getter/setter
 * 			2. getArea - 면적 계산 후 반환  
 * 			3. getPerimeter - 둘레 계산 후 반환 
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
