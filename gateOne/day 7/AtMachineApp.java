import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		/*ArrayList<String>profile2 = new ArrayList<String>();*/
		Scanner input = new Scanner(System.in);
		String[] profile1 = new String[3];
		String[] profile2 = new String[3];
		System.out.println("Create your profile");
		
		System.out.println("Enter first name:");
		String user1 = input.next();
		profile1[0] = user1;
		System.out.println("Enter last name:");
		String user2 = input.next();
		profile1[1] = user2;
		System.out.println("Enter pin name:");
		String pin1 = input.next();
		profile1[2] = pin1;

		

		System.out.println("Enter first name:");
		String user3 = input.next();
		profile2[0] = user3;
		System.out.println("Enter last name:");
		String user4 = input.next();
		profile2[1] = user4;
		System.out.println("Enter pin name:");
		String pin2 = input.next();
		profile2[2] = pin2;
		
		int[] accountBalance = new int[2];		
		
		System.out.printf("%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3.Transfer");
		int index = input.nextInt();
		int result = transaction(index);
		
		System.out.print(result);
		
		switch(index){
			case 3:
				int transferAmt = input.nextInt();
				break;
		}

		

		if(accountBalance[0] == 0){
			System.out.print("your balance is too low");
		}else if(accountBalance[0] < transferAmt){
			System.out.print("your balance is too low");
		}else{
			accountBalance[0] - transferAmt;
		}
		

		


	}

	
	public static int transaction(int digit){
		int balance = 0;
		Scanner input = new Scanner(System.in);
		switch(digit){
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
		return balance;
	}



}