package MISSION.KGW;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;

        for (int i = 0 ; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++)
                if (arr[j] > arr[j+1] ) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0 ; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++)
                if (arr[j] < arr[j+1] ) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        sc.close();
    }
}
