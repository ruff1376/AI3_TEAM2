package MISSION.KGW;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int arr[][] = new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = count;
					count++;
				}
			}
			
			if (i%2 == 1) {
				for (int j = n-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
