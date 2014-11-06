package exam.anonymouseclass;

/*
 * 7. Anonymous Class(무명/익명 클래스)
 * - 클래스 몸체는 정의되지만 이름이 없는 클래스
 * - 클래스를 정의하면서 동시에 객체를 생성함!
 * - 이름이 없어서 한 번만 사용이 가능 
 */

interface AnonymousInterface {
	public void anonymousTest();
}

public class AnonymousClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInterface ac = new AnonymousInterface() {
			
			@Override
			public void anonymousTest() {
				// TODO Auto-generated method stub
				System.out.println("Test");
			}
		};
		
		ac.anonymousTest();
	}
}
