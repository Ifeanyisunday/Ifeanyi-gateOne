import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		
		Scanner input = new Scanner(System.in);
		System.out.println("Create your profile");
		System.out.println("Enter first name:");
		String name1 = input.next();
		System.out.println("Enter last name:");
		String name2 = input.next();
		System.out.println("Enter pin:");
		int pin = input.nextInt();

		int balance = 0;
		System.out.printf("%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw");
		int index = input.nextInt();
		switch(index){
			case 1:
				System.out.println("enter deposit amount:");
				int depositAmt = input.nextInt();
				balance += depositAmt;
				break;
			case 2:
				System.out.println("enter withdrawal amount:");
				int withdrawAmt = input.nextInt();
				balance -= withdrawAmt;
				break;
		}
		

		System.out.print(balance);

		


	}


}