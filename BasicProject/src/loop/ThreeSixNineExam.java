package loop;

public class ThreeSixNineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num10 = 0;		// 10의 자리 저장 
		int num1 = 0;	// 1의 자리 저장 
		
		for(int i=1; i<=99; i++) {
			num10 = i / 10;			// 10의 자리 계산 
			num1 = i % 10;			// 1의 자리 계산 
			int clap = 0;	// 박수 횟수 저장 
			
			
			// 369 게임 규칙 조건 만족 여부 확인 
			if(num10 == 3 || num10 == 6 || num10 == 9)
				clap++;			// 박수 횟수 증가 
			
			if(num1 == 3 || num1 == 6 || num1 == 9)
				clap++;			// 박수 횟수 증가 
			
			
			// 해당 숫자의 순서 출력 
			System.out.print("\n" + num10 + num1 + "=======>");
			
			// 박수 횟수에 따른 결과 출력 
			if(clap == 0)
				System.out.print("" + num10 + num1);
			
			else if(clap == 1)
				System.out.print("짝");
			
			else if(clap == 2)
				System.out.print("짝짝");
			
		}
	}

}
