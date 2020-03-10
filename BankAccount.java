import java.util.Scanner;
public class BankAccount { 
        private String name;
        private String password;
        private double balance;

public void withdraw(String enteredPassword, double amount) {
	if (password.equals(enteredPassword) && balance >= amount) {
		balance = balance - amount;
        }
}        

public void deposit(String enteredPassword, double amount) {
	if (password.equals(enteredPassword)) {
		balance = balance + amount;
                }
        }
public BankAccount(String initName, String initPass, double initBalance) { 
	this.name = initName;
	this.password = initPass;
	this.balance = initBalance;
}
public double getBalance(String enteredPassword) {
	if (password.equals(enteredPassword)) {
		return balance;
	} else {
		return -1; 
	}
}

public boolean setPassword(String oldPassword, String newPassword) {
	if (password.equals(oldPassword)) {
		password = newPassword;
		return true;
	} else {
		return false;
	}
}
public void setName(String newName) {
	this.name = newName;
}
public String getName() {
	return name;
} 
public static void main(String[] args){
	BankAccount myAccount = new BankAccount("Java", "CSCI1933 rules!", 100.50);
	myAccount.setPassword("CSCI1933 rules!", "newPassword");
	myAccount.deposit("newPassword", 100.50);
	System.out.println("My account's balance is: " + myAccount.getBalance("newPassword"));
	System.out.println("Enter your password"); 
	Scanner myScanner = new Scanner(System.in);
	String input = myScanner.nextLine();
	System.out.println("My account's balance is: " + myAccount.getBalance(input));
}
}
