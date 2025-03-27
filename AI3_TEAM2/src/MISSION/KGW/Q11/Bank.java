package MISSION.KGW.Q11;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo;
		Account[] accountList = new Account[1000];
		int accountCount = 0;
		int adminPw = 971230;
		do {
			System.out.println("===========================");
			System.out.println("1. 계좌 등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("===========================");
			System.out.print("입력>> ");
			menuNo = sc.nextInt();
			sc.nextLine();
			System.out.println();
			switch (menuNo) {
				case 1:
					if (accountCount < 1000) {
						System.out.print("계좌번호>> ");
						String accountNum = sc.nextLine();
						System.out.print("예금주>> ");
						String depositorName = sc.nextLine();
						System.out.print("최초예금액>> ");
						int firstDeposit = sc.nextInt();
						if (firstDeposit < 0 || firstDeposit > 1000000000) {
								System.out.println("0원부터 10억 까지만가능");
								break;
							}
							System.out.print("비밀번호>> ");
							int password = sc.nextInt();
							sc.nextLine();
							Account account = new Account(accountNum, depositorName, firstDeposit, password);
							accountList[accountCount] = account;
							accountCount++;
							System.out.println("'"+ depositorName + "'님의 계좌가 개설되었습니다.");
						}
					else {
						System.out.println("계좌가 너무많습니다.");
					}
					break;
				case 2:
					System.out.println("========입금========");
					System.out.print("계좌번호>> ");
					String depositAcc = sc.nextLine();
					System.out.print("입금액>> ");
					int deposit = sc.nextInt();
					sc.nextLine();
					int yesorno;
					boolean found = false;
					for (int i = 0; i < accountCount; i++) {
						if (accountList[i] != null && accountList[i].getBankAccount().equals(depositAcc)) {
							System.out.println("'"+accountList[i].getDepositor()+"'님께 입금하는게 맞으십니까?");
							System.out.println("1. 예");
							System.out.println("2. 아니오");
							yesorno = sc.nextInt();
							if(yesorno == 1) {
								accountList[i].setBalance(accountList[i].getBalance() + deposit);
								if (accountList[i].getBalance() < 1000000000) {
									System.out.println("'"+accountList[i].getDepositor()+"'님의 계좌에 " + deposit + " 원이 입금되었습니다.");
									found = true;
									break;
								}
								else {
									accountList[i].setBalance(accountList[i].getBalance()-deposit);
									System.out.println("입금 실패 돈이 너무많습니다;;");
									found = true;
									break;
								}
							}
							else {
								found = true;
								System.out.println("입금 취소"); break;
							}
						}
					}
					if (!found) {
						System.out.println("계좌를 찾을 수 없습니다.");
					}
						break;
				case 3: 
					System.out.println("========출금========");
					System.out.print("계좌번호>> ");
					String withdrawAcc = sc.nextLine();
					System.out.print("비밀번호>> ");
					int password = sc.nextInt();
					System.out.print("출금액>> ");
					int withdrawal = sc.nextInt();
					sc.nextLine();
					found = false;
					if(accountCount == 0) {
						System.out.println("등록된 계좌가 없습니다.");
						break;
					}
					for (int i = 0; i < accountCount; i++) {
						if (accountList[i] != null && accountList[i].getBankAccount().equals(withdrawAcc)) {
							if (accountList[i].getPassWord()==password) {
								if (withdrawal < 1000000 || withdrawal > 0) {
									accountList[i].setBalance(accountList[i].getBalance()-withdrawal);
									System.out.println("'"+accountList[i].getDepositor()+"' 님의 계좌에 " + withdrawal+ " 원이 출금되었습니다.");
									found = true;
									break;
								}
								else {
									System.out.println("출금 실패 // 보이스피싱 조심하세요~");
									found = true;
									break;
								}
							}
							else {
								System.err.println("비밀번호가 다릅니다!");
								found = true;
								break;
							}
						}
					}
					if (!found) {
						System.out.println("계좌를 찾을 수 없습니다.");
					}
					break;
			
				case 4:
					System.out.println("========계좌조회========");
					System.out.print("계좌번호>> ");
					String accountNum = sc.nextLine();
					System.out.print("비밀번호>> ");
					password = sc.nextInt();
					System.out.println();
					sc.nextLine();
					found = false;
					for (int i = 0; i < accountCount; i++) {
						if (accountList[i] != null && accountList[i].getBankAccount().equals(accountNum)) {
							if (accountList[i].getPassWord()==password) {
								System.out.println("'"+accountList[i].getDepositor()+"'님의 계좌 잔액은 " + accountList[i].getBalance()+" 원 입니다.");
								found = true;
								break;
							}
							else {
								System.err.println("비밀번호가 다릅니다!");
								found = true;
								break;
							}
						}
					}
					if (!found) {
						System.out.println("계좌를 찾을 수 없습니다.");
					}
					break;
				case 5: 
					System.out.print("관리자 비밀번호>> ");
					int enterPw = sc.nextInt();
					if(adminPw == enterPw ) {
						System.out.println("==========계좌목록============");
						System.out.println("예금주\t\t\t 계좌번호\t\t\t잔고");
						for (int i = 0; i <= accountCount; i++) {
							if (accountList[i] != null) {
								System.out.println(accountList[i].getDepositor()+"\t\t\t"+accountList[i].getBankAccount()+"\t\t\t"+accountList[i].getBalance());
							}
						}
					}
					else {
						System.out.println("조회불가");
					}
					break;

		}
		} while (menuNo!=6);
		System.out.println("시스템을 종료합니다.");
	
		
		
		sc.close();
	}

}
