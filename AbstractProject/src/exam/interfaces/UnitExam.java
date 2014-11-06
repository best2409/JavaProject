package exam.interfaces;

public class UnitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fighter fighter = new Fighter();
         
        if (fighter instanceof Unit) {
            System.out.println("fighter는 Unit 클래스의 자손입니다.");
        }
         
        if (fighter instanceof Fightable) {
            System.out.println("fighter는 Fightable 인터페이스를 구현했습니다.");
        }
         
        if (fighter instanceof Movable) {
            System.out.println("fighter는 Movable 인터페이스를 구현했습니다.");
        }
         
        if (fighter instanceof Attackable) {
            System.out.println("fighter는 Attackable 인터페이스를 구현했습니다.");
        }
         
        if (fighter instanceof Object) {
            System.out.println("fighter는 Object 클래스의 자손입니다.");
        }
	}

}
