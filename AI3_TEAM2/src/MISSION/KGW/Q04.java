package MISSION.KGW;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a=1;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < (N-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a ; j++) {
                System.out.print("*");
                
            }System.out.println();
            a+=2;
        }
// 4 3 2 1    5 4   5 3  5 2  1 3 5 7 9
/*
 * .    *
 * .   ***
 * .  *****
 * . *******
 * .*********
 * .
 */
        sc.close();
    }

}
