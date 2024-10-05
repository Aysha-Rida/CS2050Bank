package Program5.java;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerMain {
public static void main (String[]args) throws FileNotFoundException, IOException 
{
	Queue<Customer> customerQueue= new LinkedList<>();
	
	for (int i = 1; i <= 10; i++) 
	{
		ACCOUNT account = new ACCOUNT("A" + i, 1000 * i);  
        Customer customer = new Customer("C" + i, "Customer_" + i, account); 
        customerQueue.add(customer); 
    }
	try (FileOutputStream fos = new FileOutputStream("Customers.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) 
	{
               oos.writeObject(customerQueue);
               System.out.println("Customers have been saved.");
        }
	}
}
