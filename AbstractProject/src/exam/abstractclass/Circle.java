package exam.abstractclass;

public class Circle extends Shape {
	private int radius;
	
	// 부모 클래스의 추상 메소드 draw()는 자식 클래스에서 반드시 재정의(Override)해줘야 함!!
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원!!");
	}

}
