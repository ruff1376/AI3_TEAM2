package Q_KBG;

import java.util.Scanner;

public class KBG01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eng, math , java;
		System.out.println("영어 점수 : 80");
		eng  = sc.nextInt();
		System.out.println("수학 점수 : 90");
		math = sc.nextInt();
		System.out.println("자바 점수 : 100");
		java = sc.nextInt();
		
		
		int total = eng + math + java;
		total = (80 + 90 + 100);
		
		double average = total / 3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
	}

}
