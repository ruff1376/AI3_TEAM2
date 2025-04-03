package MISSION.KGW.Q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<Shape>();
		String input;
		double width;
		double height;
		double radius;
		boolean sw = true;
		
		do {
			System.out.println("1.삼각형 2.사각형 3.원형");
			System.out.println("삼각형은 한변의 길이를받으면 정삼각형으로 생성됩니다.");
			System.out.print("생성할 도형 입력 : ");
			input = sc.nextLine().trim();
			System.out.println("입력값: [" + input + "]"); 
			switch (input) {
			case "1" :
				Triangle tri = new Triangle();
				System.out.print("밑변을 입력 : ");
				width = sc.nextDouble();
				sc.nextLine();
				tri.setWidth(width);
				tri.setHeight(width);
				list.add(tri);
				break;
			case "2" :
				Rectangle rec = new Rectangle();
				System.out.print("길이 입력 : ");
				width = sc.nextDouble();
				System.out.print("높이 입력 : ");
				height = sc.nextDouble();
				sc.nextLine();
				rec.setHeight(height);
				rec.setWidth(width);
				list.add(rec);
				break;
			case "3" :
				Circle cir = new Circle();
				System.out.print("반지름 입력 : ");
				radius = sc.nextDouble();
				sc.nextLine();
				cir.setRadius(radius);
				list.add(cir);
				break;
			case "그만" : sw = false;
				break;
			default: System.out.println("1.삼각형 2.사각형 3.원형 중에 입력해주세요");
					 System.out.println();
				break;
			}
			
		} while (sw);
		double sumRound = 0;
		double sumArea = 0;

		for (Shape shape : list) {
			System.out.println(shape);
			 sumArea += shape.area();
			 sumRound += shape.round();
		}
		System.out.println("도형들의 둘레 총합 : " + sumRound);
		System.out.println("도형들의 넓이 총합 : " + sumArea);

		
		sc.close();
	}

}
