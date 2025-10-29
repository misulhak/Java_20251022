package ex12;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE=0; //대소문자 상관 없음. 관습적으론 대문자
	static final int MAX_BALANCE=1000000;
	
	public Account() {
		
	}

	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance) {
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}
