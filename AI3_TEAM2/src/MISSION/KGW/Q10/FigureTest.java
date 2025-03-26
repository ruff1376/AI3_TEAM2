package MISSION.KGW.Q10;

public class FigureTest {

	public static void main(String[] args) {
		Triangle tri = new Triangle (10,20);
		Rectangle rec = new Rectangle(10,20);
		Circle cir = new Circle(10);
		Trapezoid tra = new Trapezoid(10,20,30);
		
		
		System.out.println("삼각형의 넓이 : " + tri.getArea());
		System.out.println("사각형의 넓이 : " + rec.getArea());
		System.out.println("원형의 넓이 : " + cir.getArea());
		System.out.println("사다리꼴의 넓이 : " + tra.getArea());
		
		
	}
}
