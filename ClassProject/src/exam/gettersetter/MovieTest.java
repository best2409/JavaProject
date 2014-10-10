package exam.gettersetter;

/* 2. Field, Method(getter/setter) -----------------
 * - 클래스의 구성요소 : Field(=필드=변수=속성), Method(=함수) => 캡슐화 
 * - Field : 데이터 저장하기 위한 구성요소 
 *  	   : "접근제어자 데이터타입 필드명;"으로 선언 -> private으로 선언하여 외부에 노출되지 않게 하는 것이 데이터 무결성을 위해 좋음!(정보은닉)
 * - Method : 데이터를 처리하기 위한 구성요소 
 * 		    : "리턴데이터타입 메소드명(매개변수들...) { }"로 정의 -> 외부에서 호출해야지만 실행!
 *          : getter -> 외부에 객체 내부의 값을 리턴하는 역할, 매개변수 없고, 리턴타입 있음!
 *            setter -> 외부에서 값을 매개변수로 넘겨주면 객체 내부의 값을 설정하는 역할, 매개변수 있고, 리턴타입 없음!
 * 
 * 예제 ------------------------------------------------------------------
 * Class : Movie
 * Field : 영화제목(title), 평점(starRate), 감독(director), 연도(year)
 * Method : 1. getter/setter
 * 			2. print - 모든 정보 출력 
 * ----------------------------------------------------------------------
 */

class Movie {
	// Field(접근제어자 데이터타입 필드명) ---------------------------------------
	private String title;
	private int starRate;
	private String director;
	private int year;
	
	// getter/setter Method( 리턴데이터타입 메소드명(매개변수들...) { } ) ---------------------------------------
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStarRate() {
		return starRate;
	}
	public void setStarRate(int starRate) {
		this.starRate = starRate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// Method --------------------------------------------------------
	public void print() {
		System.out.println("Title : " + this.title);
		System.out.println("Star Rate : " + this.starRate);
		System.out.println("Director : " + this.director);
		System.out.println("Year : " + this.year);
	}
}

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 	Test
		 *  1) Movie 객체 생성
		 *  2) setter 메소드 이
		 *  3) getter 메소드 이용
		 *  4) print 메소드 이용 
		*/
		
		Movie m1 = new Movie();
		m1.setTitle("Begin Again");
		m1.setStarRate(10);
		m1.setDirector("John Carney");
		m1.setYear(2013);
		
		
		// System.out.println("Title : " + m1.getTitle());
		
		m1.print();
	}

}
