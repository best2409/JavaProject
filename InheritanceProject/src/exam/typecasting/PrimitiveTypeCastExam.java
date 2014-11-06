package exam.typecasting;

/**
 * @author N.Y Lee
 * 1. Type Cast 유형
 * - 상향 형변환(UpCating) : 자동 형변환(형변환 연산 생략가능)
 * - 하향 형변환(DownCasting) : 강제 형변환(형변환 연산 생략불가)
 * 
 * 2. Type Cast 상세내용 
 * - Primitive Type(기본형)간 형변환 : boolean을 제외하고 서로 형변환 가능 
 * - Reference Type(참조형)간 형변환 : 상속관계인 경우에만 형변환 가능 
 * - Primitive Type과 Reference 간 형변환 : Wrapper Class(Boolean, Character, Byte, Short, Integer, Long, Float, Double)
 * 
 * 3. Primitive Type(기본형)간 형변환
 * - 상항 형변환(UpCasting) : 작은 자료형의 값을 큰 자료형의 값으로 저장
 * - 하향 형변환(DownCasting) : 큰 자료형의 값을 작은 자료형의 값으로 저장 
 */



public class PrimitiveTypeCastExam {
	public static void main(String[] args) {
		/**
		 * 기본형 형변환 
		 * 1) 상향 형변환(UpCasting) : int -> double
		 * 2) 하향 형변환(DownCasting) : double -> int
		 */
		
		
		// int -> double
		int i1 = 10;
		double d1 = i1; // double d1 = (double) i1, 형변환 연산 생략 가능
		
		System.out.println("실수형 : " + d1);
		
		// double -> int
		double d2 = 10.0;
		int i2 = (int) d2;  // 형변환 연산 생략 불가능 
		
		System.out.println("정수형 : " + i2);
	}
}	
