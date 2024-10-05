package Program5.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class Program5 {
	public static void main(String[] args) {

		AccountStack<Checking> checkStack = new AccountStack<>();
		AccountStack<Saving> saveStack = new AccountStack<>();

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



	public static <T extends Serializable> void serializeStack(AccountStack<T> stack, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
             int count= 0;
             while (!stack.isEmpty()) {
                oos.writeObject(stack.pop());
                count++;
            }
            System.out.println(count + " objects written to file: " + fileName);
            System.out.println(fileName + " has been saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
