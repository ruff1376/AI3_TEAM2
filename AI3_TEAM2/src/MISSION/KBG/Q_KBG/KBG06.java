
package Q_KBG;

import java.util.Random;

public class KBG06 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("몇 게임? ");
        int N = scanner.nextInt(); 
        
        Random random = new Random();

    
        for (int game = 1; game <= N; game++) {
            
            int[] lottoNumbers = new int[6];

           
            int count = 0; 
            while (count < 6) {
                int num = random.nextInt(45) + 1;  
                
               
                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (lottoNumbers[i] == num) {
                        isDuplicate = true; 
                        break; 
                    }
                }

                if (!isDuplicate) {
                    lottoNumbers[count] = num;
                    count++; 
                }
            }

            System.out.print("[" + game + " 게임] : ");
            for (int i = 0; i < 6; i++) {
                System.out.print(lottoNumbers[i] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
