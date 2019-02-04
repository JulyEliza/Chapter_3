import java.util.Scanner;

public class AccountTest2 {
	
	public static void main(String[] args) {
		Account2 account1 = new Account2("Jane Green", 50.00);
		Account2 account2 = new Account2("John Blue", -7.53);

		displayAccount(account1);
		displayAccount(account2);//hello
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); // 13-14
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f%n", displayAccount(account1)); // 28-29
		System.out.printf("%s balance: $%.2f%n", displayAccount(account2)); // 30-31

		System.out.print("Enter deposit amount for account2: ");
		double depositAmount2 = input.nextDouble(); // had to change depositAmount to depositAmount2 so it would compile
													
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount2);
		account2.deposit(depositAmount2);

		System.out.printf("%s balance: $%.2f%n", displayAccount(account1)); // 40-41
		System.out.printf("%s balance: $%.2f%n", displayAccount(account2)); // 42-43
		
		input.close();
	}

	public static Object[] displayAccount(Account2 account1) {
	    System.out.printf("%s balance: $%.2f%n",
	      account1.getName(), account1.getBalance());
		return null;
	}
}