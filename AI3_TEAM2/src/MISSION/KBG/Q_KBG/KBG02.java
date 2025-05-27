package Q_KBG;

import java.util.Scanner;

	public class KBG02 {
	    public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);
	        
	        int N = scanner.nextInt();
	        
	        int oddSum = 0;
	        String oddNumbers = "";
	        
	        int evenSum = 0;
	        String evenNumbers = "";
	        
	        String divisors = "";
	        
	        for (int i = 1; i <= N; i++) {
	            if (i % 2 != 0) { // 홀수
	                oddSum += i;
	                if (!oddNumbers.isEmpty()) {
	                    oddNumbers += "+";
	                }
	                oddNumbers += i;
	            } else { // 짝수
	                evenSum += i;
	                if (!evenNumbers.isEmpty()) {
	                    evenNumbers += "+";
	                }
	                evenNumbers += i;
	            }
	        }

	        for (int i = 1; i <= N; i++) {//약수
	            if (N % i == 0) {
	                if (!divisors.isEmpty()) {
	                    divisors += " ";
	                }
	                divisors += i;
	            }
	        }

	        System.out.println(oddNumbers + "=" + oddSum);
	        System.out.println(evenNumbers + "=" + evenSum);
	        System.out.println(divisors);
	        
	        scanner.close();
	    }
	}




	