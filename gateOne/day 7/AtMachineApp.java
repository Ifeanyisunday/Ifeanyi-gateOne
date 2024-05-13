import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		ArrayList<String>accoutFirstName = new ArrayList<String>();
		ArrayList<String>accoutLastName = new ArrayList<String>();
		ArrayList<String>accoutPin = new ArrayList<String>();
		System.out.println("Create your profile");
		
		int count = 0;
		do{
			System.out.println("Enter first name:");
			String user1 = input.next();
			accoutFirstName.add(user1);
			System.out.println("Enter last name:");
			String user2 = input.next();
			accoutLastName.add(user2);
			System.out.println("Enter pin name:");
			String pin1 = input.next();
			accoutPin.add(pin1);
			count++;
			System.out.println("Do you want to create new Account?");
			String createNew = input.next();
		while(createNew.equalsIgnoreCase("yes"));

		ArrayList<String>accountBalance = new ArrayList<String>();		
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3. Transfer", "4. Check Balance");
		int index = input.nextInt();

		int transferAmt = 0;
		int transferDone = 0;
		switch(index){
			case 1:
				System.out.println("enter deposit amount:");
				int depositAmt = input.nextInt();
				accountBalance += depositAmt;
				System.out.print(profile1AccountBalance);
				break;
			case 2:
				System.out.println("enter withdrawal amount:");
				int withdrawAmt = input.nextInt();
				if(profile1AccountBalance <= 0 && profile1AccountBalance <= withdrawAmt){
					System.out.print("your balance is too low, Add money to your account");
				}else{
					profile1AccountBalance -= withdrawAmt;
				}
				System.out.print(profile1AccountBalance);
				break;
			case 3:
				System.out.println("enter transfer amount:");
				transferAmt = input.nextInt();
				if(profile1AccountBalance == 0){
				System.out.print("your balance is too low");
				}else if(profile1AccountBalance < transferAmt){
				System.out.print("your balance is too low");
				}else{
					transferDone = accountBalance[0] - transferAmt;
					accountBalance[1] = transferDone;
					System.out.println(profile2AccountBalance);
				}
				break;
			case 4:
				System.out.print(profile1AccountBalance);
				break;
		}

		System.out.print(profile1AccountBalance);
		System.out.print("Do you want to continue? ");

		
	


	}



}