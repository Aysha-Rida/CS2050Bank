package Program5.java;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Stack;

public class CustomerMain {
    public static void main (String[] args) throws FileNotFoundException, IOException {
    	LinkedListQueue customerQueue = new LinkedListQueue();
    	Stack<ACCOUNT> accountStack = new Stack<>();
        Random random = new Random(); 

        for (int i = 1; i <= 10; i++) {
            boolean isChecking = random.nextBoolean();  // Randomly decide between Checking or Saving
            ACCOUNT account;
            if (isChecking) {
                account = Checking.createCheckingAccount(random, i);
            } else {
                account = Saving.createSavingAccount(random, i);
            }
            accountStack.push(account);
        }

        for (int i = 1; i <= 10; i++) {
            Customer customer = new Customer("C" + i, "Customer_" + i, null);
            customerQueue.enqueue(customer);

        }

        for (int i = 0; i < 30; i++) {
        	Customer currentCustomer = customerQueue.dequeue();

            if (currentCustomer.getAccount() == null && !accountStack.isEmpty()) { //checking if customer has an account
                currentCustomer.setAccount(accountStack.pop());
            }

            double transactionAmount = random.nextDouble() * 100; // Random amount
            boolean isPositive = random.nextBoolean(); // Random positive or negative
            ACCOUNT account = currentCustomer.getAccount();
           
            if (isPositive) {
                account.setBalance(account.getBalance() + transactionAmount);
            } else {
                account.setBalance(account.getBalance() - transactionAmount);
            }
            customerQueue.enqueue(currentCustomer);
        }

        System.out.println("Simulation complete. Final customer details:");
        while (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.dequeue();  // Get the next customer
            ACCOUNT account = customer.getAccount();
            if (account != null) {
            	System.out.println("Customer ID: " + customer.getCustomerID() + 
                        ", name: " + customer.getname() + 
                        ", Account Type: " + 
                        (account instanceof Checking ? "Checking" : "Saving") + 
                        ", Account Number: " + account.getAccountNumber() + 
                        ", Balance: $" + String.format("%.2f", account.getBalance()));
            }
        }

        try (FileOutputStream fos = new FileOutputStream("Customers.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(customerQueue);
            System.out.println("Customers have been saved.");
        }
    }
}