package MISSION.KGW;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String arr[] = new String[4];
        String storage[] = new String[8];
        String name[] = new String[4];
        int money[] = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            String input = sc.nextLine();
                if (input.equals("QUIT")) {
                    break;
                }
                arr[count] = input;
                count++;
        }
        int a = 0;
        for (int i = 0; i<count; i++) {
            if (arr[i] == null) continue;
            StringTokenizer st = new StringTokenizer(arr[i], " ");
            while ( st.hasMoreTokens() ) {
                storage[a] = st.nextToken();
                a++;
            }
        }
        
        for (int i = 0; i < count; i++) {
            name[i] = storage[i*2];
            money[i] = Integer.parseInt(storage[i*2 + 1]);
        }
        int temp = 0;
		int human1[] = new int[10];
		int human2[] = new int[10];
		int human3[] = new int[10];
		int human4[] = new int[10];
		
        int currency[] = {50000,10000,5000,1000,500,100,50,10,5,1};

        for (int i = 0; i < count; i++) {
            temp = money[i];
            if ( i == 0 ) {
                for ( int j = 0; j <currency.length; j++) {
                    human1[j] = temp / currency[j];
                    temp = temp%currency[j];
                }
            }
            if ( i == 1) {
                for ( int j = 0; j <currency.length; j++) {
                    human2[j] = temp / currency[j];
                    temp = temp%currency[j];
                }
                }
            if ( i == 2) {
                for ( int j = 0; j <currency.length; j++) {
                    human3[j] = temp / currency[j];
                    temp = temp%currency[j];
                }
            }
            if ( i == 3) {
                for ( int j = 0; j <currency.length; j++) {
                    human4[j] = temp / currency[j];
                    temp = temp%currency[j];
                }
            }
        }
        int paperSum[] = new int[10];
        for (int i = 0; i < currency.length; i++) {
            paperSum[i] = human1[i] + human2[i] + human3[i] + human4[i];
        }
        

        System.out.println("성명\t출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
        for (int i = 0; i <4; i++) {
            System.out.print(name[i]+"\t"+money[i]+"\t");
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    System.out.print(human1[j] + "\t");
                }
                if (i == 1) {
                    System.out.print(human2[j] + "\t");
                }
                if (i == 2) {
                    System.out.print(human3[j] + "\t");
                }
                if (i == 3) {
                    System.out.print(human4[j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.print("전체화폐매수 :\t");
        for (int i : paperSum) {
            System.out.print(i + "\t");
        }

        





        sc.close();
    }

}
