package Program5.java;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable{
		private String Name;
		private String customerID;
		private ACCOUNT account;
		

	    public Customer(String Name, String customerID, ACCOUNT account) {
	        this.Name = Name;
	        this.customerID = customerID;
	        this.account = account;
	    }

	    public ACCOUNT getAccount() {
	        return account;
	    }

	    public void setAccount(ACCOUNT account) {
	        this.account = account;
	    }

	    public String getName() {
	        return Name;
	    }

	    public String getCustomerID() {
	        return customerID;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }

	    public void setCustomerID(String customerID) {
	        this.customerID = customerID;
	    }
	}


