package Q_KBG;
import java.util.Scanner;
public class KBG07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 학생 성적 입력받기
	        int[] scores = new int[5];
	        System.out.println("학생 5명의 성적을 입력하세요 (0 ~ 100):");
	        for (int i = 0; i < scores.length; i++) {
	            System.out.print("학생 " + (i + 1) + "의 성적: ");
	            scores[i] = scanner.nextInt();
	        }

	        // 성적 오름차순 정렬 (선택정렬)
	        selectionSort(scores, true);
	        System.out.print("성적 오름차순 정렬: ");
	        printArray(scores);

	        // 성적 내림차순 정렬 (선택정렬)
	        selectionSort(scores, false);
	        System.out.print("성적 내림차순 정렬: ");
	        printArray(scores);
	    }

	    // 선택 정렬 메소드 (ascending: true -> 오름차순, false -> 내림차순)
	    public static void selectionSort(int[] arr, boolean ascending) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int extremeIdx = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (ascending) {
	                    if (arr[j] < arr[extremeIdx]) {
	                        extremeIdx = j;
	                    }
	                } else {
	                    if (arr[j] > arr[extremeIdx]) {
	                        extremeIdx = j;
	                    }
	                }
	            }
	            // Swap
	            int temp = arr[i];
	            arr[i] = arr[extremeIdx];
	            arr[extremeIdx] = temp;
	        }
	    }

	    // 배열 출력 메소드
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
		
	}

