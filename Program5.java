package Program5.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.Stack;

public class Program5 {
	public static void main(String[] args) {

		Stack<Checking> checkStack = new Stack<>();
		Stack<Saving> saveStack = new Stack<>();

		Random random = new Random();

		for (int i = 0; i < 25; i++) {
			Checking checkingAccount = Checking.createCheckingAccount(random, i);
			checkStack.push(checkingAccount);

			Saving savingsAccount = Saving.createSavingAccount(random, i);
			saveStack.push(savingsAccount);
		}

		serializeStack(checkStack, "CheckStack.txt");
		serializeStack(saveStack, "SaveStack.txt");
	}



	public static <T extends Serializable> void serializeStack(Stack<T> stack, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
             
            for (int i = 0; i < stack.size(); i++) {
                oos.writeObject(stack.pop());
            }

            System.out.println(fileName + " has been saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
