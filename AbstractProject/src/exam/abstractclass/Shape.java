package exam.abstractclass;

// 추상 클래스(Abstract Class) 
// 1. 완전하게 구현되지 않은 메소드(추상 메소드)를 가진 클래스로 객체를 생성할 수 없음! 
// 2. 상속을 목적으로 추상적인 개념만을 가지는 클래스 
public abstract class Shape {
	// 일반 변수 
	private int x, y;
	
	// 일반 메소드 -> 헤더와 몸체가 모두 있는 메소
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드(Abstract Method)
    // 1. 몸체(body)가 없는 메소드로 서브(자식) 클래스에서 반드시 재정의(Override) 해야함!
	// 2. 추상 메소드가 있는 클래스는 반드시 추상 클래스이어야 함!!
	public abstract void draw();

}
