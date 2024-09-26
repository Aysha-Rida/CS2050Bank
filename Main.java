
public class Main {
	public static void main(String[]args) {
		ACCOUNT accountTesting = new ACCOUNT ("201", 11.00, "Aysha");
		System.out.println();
		System.out.println("ACCOUNT: ");
		System.out.println("Account Holder: "+accountTesting.getAccountHolder());
		System.out.println("Account Number: "+ accountTesting.getAccountNumber());
		System.out.println("Balance: $"+accountTesting.getBalance());
		System.out.println();
		
		Savings savingsTesting= new Savings("222", 275.00,"Aysha", "1" );
		System.out.println("Savings Account: ");
		System.out.println("Account Holder: "+savingsTesting.getAccountHolder());
		System.out.println("Account Number: "+ savingsTesting.getAccountNumber());
		System.out.println("Rounting Holder: "+savingsTesting.getRoutingNumber());
		System.out.println("Balance: $"+savingsTesting.getBalance());
		System.out.println();
		
		Checking checkingTesting= new Checking("720", 39.00,"Aysha", 1.5, "2" );
		System.out.println("Savings Account: ");
		System.out.println("Account Holder: "+checkingTesting.getAccountHolder());
		System.out.println("Account Number: "+ checkingTesting.getAccountNumber());
		System.out.println("Rounting Holder: "+checkingTesting.getRoutingNumber());
		System.out.println("Interest Rate: "+checkingTesting.getInterestRate()+"%");
		System.out.println("Balance: $"+checkingTesting.getBalance());
		System.out.println();
	}

}
