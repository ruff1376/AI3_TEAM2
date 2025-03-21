package MISSION.KGW;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sumodd = 0;
		int sumeven = 0;
		
		for (int i = 1; i <=a; i+=2) {
			sumodd += i;
			System.out.print(i + "+");
		}System.out.print("="+sumodd);
		System.out.println();
		for (int i = 2; i <=a; i+=2) {
			sumeven += i;
			System.out.print(i + "+");
		}System.out.print("="+sumeven);
		System.out.println();
		for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
	}
}
