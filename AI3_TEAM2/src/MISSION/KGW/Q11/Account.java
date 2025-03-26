package MISSION.KGW.Q11;

public class Account {
	String bankAccount;
	String depositor;
	int balance;
	
	public Account() {
		this("계좌없음", "이름없음", 0);
		
	}
	public Account(String bankAccount, String depositor, int balance) {
		this.bankAccount = bankAccount;
		this.depositor = depositor;
		this.balance = balance;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getDepositor() {
		return depositor;
	}
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [bankAccount=" + bankAccount + ", depositor=" + depositor + ", balance=" + balance + "]";
	}
	
	
}
