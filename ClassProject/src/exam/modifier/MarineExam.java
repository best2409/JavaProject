package exam.modifier;

/*
 * 5. Modifier(static/final) ------------------------
 * - 클래스(정적) 멤버 : 클래스에 소속된 저장공간이 1개만 존재, 객체 생성과 상관없이 먼저 메모리를 할당함!
 *   객체(인스턴스/동적) 멤버 : 객체마다 저장공간이 별도로 존재, 객체를 생성해야만 메모리를 할당함!
 *   
 * - static : Field, Method에 붙여짐 
 * 			: instance method -> instance, static field에 접근 가능 
 *          : static method -> static field에 접근 가능 
 *          
 * - final : Class(상속하지 못함), Field(상수화), Method(오버라이딩 불가)에 붙여짐 
 *         : Field -> 초기값을 할당한 후 변경 불가능, 초기값을 줄 수 있는 경우는 선언과 동시에 초기화를 하거나, 생성자를 이용하는 경우
 *       
 *       
 *  * API에서 제공하는 Field들은 대부분 "public static final"인 경우가 많음! => 대표적인 예. Math.PI
 * 
 * 예제-------------------------------------------------------------------------------
 * Class : Marine
 * Instance Field : 체력(hp)
 * Class Field : 등급(level)
 * Final Field : 종족(TYPE = "TERRAN"), 총소지여부(ISGUN = true) - TYPE, ISGUN 값 변경 => Error 확인!
 * 
 * Instance Method : createMarine() - hp, level 변경!
 * Class Method : upgradeMarine() -  hp, level 변경! => Error 확인!
 * ---------------------------------------------------------------------------------
 */

class Marine {
	// Field ----------------------------------------------------------------------
	int hp;								// class field = static field
	static int level;					// object field = instance field 
	final String TYPE = "Terran";		// 상수화(constant) - 선언과 동시에 초기화 
	final boolean ISGUN;				// 상수화(constant) - 생성자에서 초기화 
	
	
	// Constructor ----------------------------------------------------------------------
	public Marine() {
		this.ISGUN = true;				// 상수화(constant) - 생성자에서 초기화 
	}
	
	// Method ----------------------------------------------------------------------------
	// Instance Method (instance/static field 접근가능!)
	public void createMarine() {
		this.hp = 100;					// instance field 접근가능!
		level = 10;						// static field 접근가능!
	}
	
	// Static Method (static field만 접근가능!) ---------------------------------------------------
	public static void upgradeMarine() {
		//this.hp = 200;					// instance field 접근 불가능!
		level++;							// static field 접근가능!
	}
}

public class MarineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 전에 클래스(static) 멤버들은 접근 가능!
		Marine.level = 200;
		Marine.upgradeMarine();
		
		// 객체를 생성해야만 객체(instance) 멤버들 접근 가능!
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.hp = 200;
		m2.hp = 300;
		
		m1.createMarine();
		m2.createMarine();
		
		// 객체를 생성 후 클래스(static) 멤버들은 접근 가능! -> 권장하지 않음! "클래스이름.클래스멤버"를 권장함!
		m1.upgradeMarine();
		m2.upgradeMarine();
		
		
		// 상수값 변경 -> 실패!
		// m1.TYPE ="ZERG";     // 상수값은 변경할 수 없음!
		// m2.ISGUN = false;	// 상수값은 변경할 수 없음!
	}

}
