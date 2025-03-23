package MISSION.KGW;

import java.util.Random;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int lotto[] = new int[6];

            
            for (int j = 0; j < 6; j++) {
                int lottoNum;
                do {
                    lottoNum = random.nextInt(45) + 1;
                    
                    for (int k = 0; k < j; k++) {
                        if (lotto[k] == lottoNum) {
                            lottoNum = -99;
                            break;
                        }
                    }
                } while (lottoNum == -99);
                
                lotto[j] = lottoNum;
            }
            System.out.print("[" +(i + 1)+ " 게임] : ");
            for (int a : lotto) {
                System.out.print(a + " ");
            }
            System.out.println();
        }




        sc.close();
    }

}
