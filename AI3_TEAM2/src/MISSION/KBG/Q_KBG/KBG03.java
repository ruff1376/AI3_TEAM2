package Q_KBG;

public class KBG03 {
	
	public static void main(String[] args) {
		  
		        // 1부터 100까지 반복
		        for (int i = 1; i <= 100; i++) {
		            int count = 0; // 3, 6, 9의 개수를 세는 변수

		            // 숫자를 문자열로 바꾸고, 각 자리에 3, 6, 9가 있는지 확인
		            String number = String.valueOf(i);

		            // 각 자리 숫자에 대해 3, 6, 9가 포함된 경우 '*'을 출력
		            for (int j = 0; j < number.length(); j++) {
		                char digit = number.charAt(j);
		                if (digit == '3' || digit == '6' || digit == '9') {
		                    count++;
		                }
		            }

		            // 3, 6, 9가 포함되어 있으면 '	*'을 출력
		            if (count > 0) {
		                for (int k = 0; k < count; k++) {
		                    System.out.print("*");
		                }
		            } else {
		                System.out.print(i); // 그렇지 않으면 숫자 그대로 출력
		            }

		            System.out.print(" "); // 숫자와 별을 구분하기 위해 공백 출력
		        }
		    
		

	}

}
