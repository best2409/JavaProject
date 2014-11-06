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
 * 3. Wrapper Class
 */

public class WrapperClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1) References -> Primitive : String -> int
		 * 2) Primitive -> References : int -> String
		 */
		
		// String -> int
		String str1 = "123";
		int i1 = Integer.parseInt(str1);
		
		System.out.println("문자열 -> 정수형 : " + i1);
		
		// int -> String
		int i2 = 456;
		String str2 = Integer.toBinaryString(i2);
		
		System.out.println("정수형 -> 문자열 : " + str2);
	}

}
