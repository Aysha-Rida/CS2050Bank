package Program5.java;
import java.io.Serializable;
public class ACCOUNT implements Serializable{
	protected String accountNumber;
	protected double balance;
	protected String accountHolder;
	protected double interestRate;
	protected String routingNumber;
	
	public ACCOUNT(String accountNumber, double balance, String accountHolder, double interestRate, String routingNumber) {
		this.accountNumber= accountNumber;
		this.balance= balance;
		this.accountHolder= accountHolder;
		this.interestRate=interestRate;
		this.routingNumber = routingNumber;
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

