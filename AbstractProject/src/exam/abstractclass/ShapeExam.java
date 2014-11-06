package exam.abstractclass;

/*
 * 1. Abstract Method ------------------------
 * - 완전하게 구현되지 않은 메소드(추상 메소드)를 가진 클래스로 객체를 생성할 수 없음! 
 * - 상속을 목적으로 추상적인 개념만을 가지는 클래스 
 * - 반드시 자식 클래스에서 오버라이!
 * 
 * 2. Abstract Class --------------------------------
 * - 몸체(body)가 없는 메소드로 서브(자식) 클래스에서 반드시 재정의(Override) 해야함!
 * - 추상 메소드가 있는 클래스는 반드시 추상 클래스이어야 함!!
 * 
 * 
 * 예제 -------------------------------------------------------------------------------
 * Class : Shape
 * Field : x좌표(x), y좌표(y)
 * Method : 1. move(int x, int y) - 일반 메소드 
 *          2. draw() - 추상 메소드 
 *          
 * Class : Rectangle
 * Field : 가로(width), 세로(height)
 * Method : 1. move(int x, int y) - Override 
 * 
 * Class : Circle
 * Field : 반지름(radius)
 * Method : 1. move(int x, int y) - Override
 *         
 * ---------------------------------------------------------------------------------
 */

// 테스트용 클래스 
public class ShapeExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 추상 클래스는 인스턴스(객체) 생성 불가능!
		//Shape shape = new Shape();
		
		// 2. Rectangle 인스턴스(객체) 생성 
		Rectangle r = new Rectangle();
		r.draw(); // 동적 바인딩!
	
	
		// 3. Circle 인스턴스(객체) 생성 
		Shape s = new Circle();
		
		if(s instanceof Shape) {
			System.out.println("s는 Shape 클래스 자식 클래스의 인스턴스입니다.");
		}
		
		if(s instanceof Circle) {
			System.out.println("s는 Circle 클래스의 인스턴스입니다.");
		}
	}
}
