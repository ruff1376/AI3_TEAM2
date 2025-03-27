package MISSION.KGW.Q11;

public class Account {
    private String bankAccount;
    private String depositor;
    private int balance;
    private int passWord;

    public Account() {
        this("계좌없음", "이름없음", 0, 0);
    }

    public Account(String bankAccount, String depositor, int balance, int passWord) {
        this.bankAccount = bankAccount;
        this.depositor = depositor;
        this.balance = balance;
        this.passWord = passWord;
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

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Account [계좌번호=" + bankAccount + ", 예금주=" + depositor + ", 잔액=" + balance + "원]";
    }
}