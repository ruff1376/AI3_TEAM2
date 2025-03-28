package MISSION.HJY.Q16;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 입력받은 도형 ArrayList
		ArrayList<Shape> shapeList = new ArrayList<>();
		
		while (true) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">> ");
			String input = sc.next();
			
			if (input.equals("그만")) break;
			
			// 도형 선택
			switch (input) {
				// 삼각형
				case "1":
					System.out.print("가로 : ");
					width = sc.nextDouble();
					System.out.print("세로 : ");
					height = sc.nextDouble();
					shapeList.add(new Triangle(width, height));
					break;
				// 사각형
				case "2":
					System.out.print("가로 : ");
					width = sc.nextDouble();
					System.out.print("세로 : ");
					height = sc.nextDouble();
					shapeList.add(new Rectangle(width, height));
					break;
				// 원형
				case "3":
					System.out.print("반지름 : ");
					radius = sc.nextDouble();
					shapeList.add(new Circle(radius));
					break;
			}	// - switch 끝
		}	// - while 끝
		
		System.out.println();
		
		// 넓이 총합, 둘레 총합
		double areaSum = 0.0, roundSum = 0.0;
		int count = 1;
		
		for (Shape shape : shapeList) {
			// 넓이와 둘레
			double area = shape.area();
			double round = shape.round();
			
			// 합계
			areaSum += area;
			roundSum += round;
			
			if (shape instanceof Triangle) System.out.println(count++ + " 삼각형");
			if (shape instanceof Rectangle) System.out.println(count++ + " 사각형");
			if (shape instanceof Circle) System.out.println(count++ + " 원형");
			
			System.out.println("넓이 : " + area);
			System.out.println("둘레 : " + round);
		}	// - foreach 끝
		System.out.println("\n넓이 총합 : " + areaSum);
		System.out.println("둘레 총합 : " + roundSum);
		
		sc.close();
	}

}
