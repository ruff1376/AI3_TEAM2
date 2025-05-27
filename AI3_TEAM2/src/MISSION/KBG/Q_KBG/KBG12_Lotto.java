package Q_KBG;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
public class KBG12_Lotto {



public static void main(String[] args) {
	
        System.out.print("몇 게임? ");	
		int n = 5;  //게임수 설정
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int N = scanner.nextInt();
		Random random = new Random();
		
		 
		for (int i = 0; i < n; i++) { //반복 하여 로또 번호 출력
			 ArrayList<Integer> lottoNumber = new ArrayList<>();//나열
	    
			 
			
		//중복 피하기
			 while (lottoNumber.size()<6) {
				int number = random.nextInt(45) +1; //랜덤숫자
				if (!lottoNumber.contains(number)) {
					lottoNumber.add(number);
				}
				
			}
			 Collections.sort(lottoNumber); //오름차순으로 정렬
			//출력
			 System.out.print("[" + (i+1) + " 게임] : ");
			 for (int num : lottoNumber) {
				 System.out.print(num + " " );
				 
        }
			 System.out.println();
       }
		scanner.close();
}
}


