package Q_KBG;

import java.util.Iterator;
import java.util.Scanner;
public class KBG04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
	for (int i = 1; i <=N; i++) {
		for (int j = 1; j <=2*i-1 ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}		
	scanner.close();
	
		}	
		
		}
	

