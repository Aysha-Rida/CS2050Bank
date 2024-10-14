package Program5.java;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable{
		private String name;
		private String customerID;
		private ACCOUNT account;
		

	    public Customer(String name, String customerID, ACCOUNT account) {
	        this.name = name;
	        this.customerID = customerID;
	        this.account = account;
	    }

	    public ACCOUNT getAccount() {
	        return account;
	    }

	    public void setAccount(ACCOUNT account) {
	        this.account = account;
	    }

	    public String getname() {
	        return name;
	    }

	    public String getCustomerID() {
	        return customerID;
	    }

	    public void setname(String name) {
	        this.name = name;
	    }

	    public void setCustomerID(String customerID) {
	        this.customerID = customerID;
	    }
	}


