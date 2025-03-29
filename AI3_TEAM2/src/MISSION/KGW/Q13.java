package MISSION.KGW;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Lotto {
    private static Lotto instance;
    private List<ArrayList<Integer>> lottoList;
    
    private Lotto() {
        lottoList = new ArrayList<>();
    }
    
    public static Lotto getInstance() {
        if (instance == null) {
            instance = new Lotto();
        }
        return instance;
    }
    public void addList(ArrayList<Integer> list) {
        lottoList.add(list);
    }
//    public void printList(int a) {
//        System.out.print(lottoList.get(a)+"\t");
//    }
    public void printList(int a) {
        // 해당 행을 가져오기
        ArrayList<Integer> selectedRow = lottoList.get(a);
        
        // 각 요소를 탭으로 구분하여 출력
        for (int j = 0; j < selectedRow.size(); j++) {
        	System.out.print(String.format("%02d", selectedRow.get(j)));
            if (j < selectedRow.size() - 1) {
                System.out.print("  ");
            }
        }
    }
    
    public ArrayList<Integer> get(int index) {
        return lottoList.get(index); // lottoList의 인덱스를 이용해 리스트를 반환
    }

}

public class Q13 {
    public static void main(String[] args) {
        Lotto lottoList = Lotto.getInstance();
        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = now.toLocalDate();

        // 이번 주 토요일 날짜 계산
        LocalDate thisSaturday = today.with(DayOfWeek.SATURDAY);
        LocalDate thisSunday = thisSaturday.plusDays(1); // 토요일 다음날 → 일요일

        // 기준 시간 설정
        LocalDateTime startDrawTime = LocalDateTime.of(thisSaturday, LocalTime.of(20, 0)); // 토요일 20:00
        LocalDateTime endDrawTime = LocalDateTime.of(thisSunday, LocalTime.of(6, 0)); // 일요일 06:00
        if (now.isAfter(startDrawTime) && now.isBefore(endDrawTime)) {
            System.out.println("지금은 로또를 살수없습니다.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 게임? ");
        int N = sc.nextInt();
        int atml = 0;
        int jadongSoodong[] = new int[5];
        if ( N < 6 || N > 0 ) {
        for ( int i = 0; i < N; i++) {
            System.out.print("[" + (i+1) + "게임] (1.자동 / 2.수동) : ");
            atml = sc.nextInt();
            if (atml == 1) {
                ArrayList<Integer> lottoTemp = new ArrayList<Integer>();
			
			for (int j =0; j<6; j++) {
				int rand = (int) (Math.random()*45) +1;

				if (lottoTemp.contains(rand)) j--;
				else lottoTemp.add(rand);
				Collections.sort(lottoTemp);
			}
            for (int j = 0; j < lottoTemp.size(); j++) {
				System.out.print(lottoTemp.get(j) + " ");
			}
            lottoList.addList(lottoTemp);
			System.out.println();
            jadongSoodong[i] = atml;
            }
            else if (atml == 2) {
                ArrayList<Integer> lottoTemp = new ArrayList<Integer>();

                for (int j =0; j<6; j++) {
                    System.out.print( j+1 + " : ");
                    int manual = sc.nextInt();
                    if (manual > 45 || manual < 1) {
                        j--;
                        System.err.println("1~45 중에");
                        continue;
                    }
                    if (lottoTemp.contains(manual)) {
                        j--;
                        System.err.println("중복 수는 ㄴㄴ");
                        continue;
                    }
                    else lottoTemp.add(manual);
                    Collections.sort(lottoTemp);
                    }
                    for (int j = 0; j < lottoTemp.size(); j++) {
                        System.out.print(lottoTemp.get(j) + " ");
                    }
                    lottoList.addList(lottoTemp);
                    System.out.println();
            }
            else {
                i--;
                System.out.println("1, 2 번중에 고르세요");
                continue;
                }
            }
        }
        else System.out.println("1~5게임 까지입니다 다음에 다시오세요.");
        sc.close();
        LocalDateTime buyDay = LocalDateTime.now();
        LocalDate sat = LocalDate.now();
        
        // 날짜 포맷 정의
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd일 (E) HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd일 (E)");

        // 현재 구매일 포맷팅
        String buyTime = buyDay.format(formatter1);

        // 이번 주 토요일 계산
        LocalDate saturday = sat.with(DayOfWeek.SATURDAY);
        String lottoDay = saturday.format(formatter2); // String 형태

        // 1년 1일 후 계산
        LocalDateTime targetTime = saturday.atTime(20, 0).plusYears(1).plusDays(1);
        String targetTimeFormatted = targetTime.format(formatter2); // 포맷 적용

        
        System.out.println("############ 인생역전 Lottoria ############");
        System.out.println("발행일\t: " + buyTime);
        System.out.println("추첨일\t: " + lottoDay + " 21:00:00");
        System.out.println("지급기한\t: " + targetTimeFormatted);
        System.out.println("-----------------------------------------");
        for ( int i = 0; i < N; i++){
            char ch = (char)(65+i);
            System.out.print(ch + " ");
            if (jadongSoodong[i] == 1) {
                System.out.print("자 동 ");
            }else System.out.print("수 동 ");
            lottoList.printList(i);
            System.out.println();
        }
        DecimalFormat df = new DecimalFormat("₩ #,###");
        System.out.println("----------------------------------------");
        System.out.println("금액                              "+ df.format(N*1000));
        System.out.println("#########################################");
        System.out.println();
        ArrayList<Integer> lottoNum = new ArrayList<Integer>();
        
        for (int i = 0; i <7; i++) {
            int luckyNum = (int) (Math.random()*45) +1;
            if (lottoNum.contains(luckyNum)) i--;
				else lottoNum.add(luckyNum);
			Collections.sort(lottoNum);
        }
        int bonusNum = 0;
        boolean bonustype = true;
        do {
        	bonusNum = (int) (Math.random()*45) +1;
        	if (!lottoNum.contains(bonusNum))
        		bonustype = false;
        	else bonusNum = 0;
			
		} while (bonustype);
        System.out.print("당첨 번호 : ");
        DecimalFormat df2 = new DecimalFormat("00");
        for (int j = 0; j < lottoNum.size()-1; j++) {
            System.out.print(df2.format(lottoNum.get(j)) + " ");
        }
        System.out.println();
        System.out.println("보너스 번호 : " + df2.format(bonusNum));
        System.out.println();
        System.out.println("################ 당첨 결과 ################");
        int count = 0;
        int bonCount = 0;
        for ( int i = 0; i < N; i++){
            char ch = (char)(65+i);
            System.out.print(ch + " ");
            if (jadongSoodong[i] == 1) {
                System.out.print("자 동 ");
            }else System.out.print("수 동 ");
            lottoList.printList(i);
            int result[] = new int[N];
            int bonResult[] = new int[N];
            for (int j = 0; j < N; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (lottoNum.contains(lottoList.get(j).get(k))) {
                            count++;
                        }
                    }
                    result[j] = count;
                    count = 0;
                }
            bonusNum = lottoNum.get(6);
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 6; k++) {
                    if (lottoList.get(j).get(k) == bonusNum) {
                        bonCount++;
                    }bonResult[j] = bonCount;
                    bonCount = 0;
                }
            }
            if (bonResult[i] > 0 ) {
                switch (result[i] + bonResult[i]) {
                    case 6: System.out.println("\t(2등)");
                    break;
                    case 5: System.out.println("\t(3등)"); 
                    break;
                    case 4: System.out.println("\t(4등)"); 
                    break;
                    case 3: System.out.println("\t(5등)"); 
                    break;
                    default : System.out.println("\t(낙첨)");
                    break;
                }
            }
            else {
                switch (result[i]) {
                    case 6: System.out.println("\t(1등)");
                    break;
                    default : System.out.println("\t(낙첨)");
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("#########################################");


    }

}
