package exam.abstractclass;

/*
 * 1. Abstract Method ------------------------
 * - ������(body)��� ������ ������������ ������(������) ��������������� ��������� ���������(Override) ���������!
 * - ������ ������������ ������ ������������ ��������� ������ ������������������ ���!!
 * - ������ ��������� ������!
 * 
 * 2. Abstract Class --------------------------------
 * - ������(body)��� ������ ������������ ������(������) ��������������� ��������� ���������(Override) ���������!
 * - ������ ������������ ������ ������������ ��������� ������ ������������������ ���!!
 * 
 * 
 * ������-------------------------------------------------------------------------------
 * Class : Shape
 * Field : x������(x), y������(y)
 * Method : 1. move(int x, int y) - ������ ��������� 
 *          2. draw() - ������ ��������� 
 *          
 * Class : Rectangle
 * Field : ������(width), ������(height)
 * Method : 1. move(int x, int y) - Override 
 * 
 * Class : Circle
 * Field : ���������(radius)
 * Method : 1. move(int x, int y) - Override
 *         
 * ---------------------------------------------------------------------------------
 */

// ������������ ������
public class ShapeExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ������ ������������ ��������������� ��� ��� ������
		//Shape shape = new Shape();
		
		// 2. Rectangle ������������ ������
		Rectangle r = new Rectangle();
		r.draw(); // ������ ��������� 
	
	
		// 3. Circle ������������ ������ 
		Shape s = new Circle();
		
		if(s instanceof Shape) {
			System.out.println("s��� Shape��� ������ ���������������.");
		}
		
		if(s instanceof Circle) {
			System.out.println("s��� Circle��� ������ ���������������.");
		}
	}
}
