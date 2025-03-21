package MISSION.HJY;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < n; j++)
					System.out.print(n * i + j + 1 + " ");
			else
				for (int j = n - 1; j >= 0; j--)
					System.out.print(n * i + j + 1 + " ");
			System.out.println();
		}
		sc.close();
	}
}
