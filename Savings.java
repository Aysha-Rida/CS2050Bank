
public class Savings extends ACCOUNT{
	private String routingNumber;
	
	public Savings(String accountNumber, double balance, String accountHolder, String routingNumber) {
		super(accountNumber, balance, accountHolder);
		this.routingNumber= routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber= routingNumber;
	}	
	public String getRoutingNumber(){
		return routingNumber;
	}
}
