package exam.gettersetter;

/*
 * Class : Movie
 * Field : 영화제목(title), 평점(starRate), 감독(director), 연도(year)
 * Method : 1. getter/setter
 * 			2. print - 모든 정보 출력 
 */

class Movie {
	// Field ---------------------------------------
	private String title;
	private int starRate;
	private String director;
	private int year;
	
	// getter/setter Method ---------------------------------------
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
