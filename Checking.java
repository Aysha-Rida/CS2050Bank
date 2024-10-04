package Program5.java;
import java.io.Serializable;
import java.util.Random;

public class Checking extends ACCOUNT implements Serializable {
	

	 
	    public Checking(String accountNumber, double balance, String accountHolder, double interestRate, String routingNumber) {
	        super(accountNumber, balance, accountHolder, interestRate, routingNumber);
	        this.balance = balance;
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.interestRate = interestRate;
	        this.routingNumber = routingNumber;
	    }
	
	 
	    public static Checking createCheckingAccount(Random random, int index) {
	        String accountNumber = String.format("%09d", random.nextInt(1_000_000_000));
	        double balance = 100 + (10000 - 100) * random.nextDouble();
	        String accountHolder = "Holder " + (index + 1);
	        double interestRate = 0.01 + (0.05 - 0.01) * random.nextDouble();
	        String routingNumber = String.format("%09d", random.nextInt(1_000_000_000));
	 
	        return new Checking(accountNumber, balance, accountHolder, interestRate, routingNumber);
	    }
	}
