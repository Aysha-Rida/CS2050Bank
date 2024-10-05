package Program5.java;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AccountStack<T extends Serializable> {
    protected ArrayList<T> stack;
    
    public AccountStack() {
        stack = new ArrayList<>();
    }
    public void push(T entry) {
        stack.add(entry);
    }
    public T pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public ArrayList<T> getStack() {
        return stack;
    }
    public void writeStackToFile(String filename) {
    	
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) 
        {
        	out.writeObject(stack);
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    public void readStackFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            stack = (ArrayList<T>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}