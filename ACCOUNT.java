
public class ACCOUNT {
	
	protected String accountNumber;
	protected double balance;
	protected String accountHolder;
	
	public ACCOUNT(String accountNumber, double balance, String accountHolder) {
		this.accountNumber= accountNumber;
		this.balance= balance;
		this.accountHolder= accountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber= accountNumber;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder= accountHolder;
	}	
	public void setBalance(double balance) {
		this.balance= balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
