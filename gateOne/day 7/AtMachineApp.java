import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		/*ArrayList<String>accoutFirstName = new ArrayList<String>();
		ArrayList<String>accoutLastName = new ArrayList<String>();
		ArrayList<String>accoutPin = new ArrayList<String>();*/

		ArrayList<ArrayList<String>>account = new ArrayList();
		System.out.println("Create your profile");
		
		String createNew;
		int count = 0;
		do{
			System.out.println("Enter first name:");
			String userInput1 = input.next();
			account.get(0).add(userInput1);
			System.out.println("Enter last name:");
			String userInput2 = input.next();
			account.get(1).add(userInput2);
			System.out.println("Enter pin name:");
			String pin1 = input.next();
			account.get(2).add(pin1);
			count++;
			System.out.println("Do you want to create new Account?");
			createNew = input.next();
		}while(createNew.equalsIgnoreCase("yes"));

		ArrayList<Integer>accountBalance = new ArrayList<Integer>();		
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3. Transfer", "4. Check Balance");
		int index = input.nextInt();

		int transferAmt = 0;
		int transferDone = 0;
		switch(index){
			case 1:
				System.out.println("Enter account first name:");
				String accountName = input.next();
				System.out.println("Enter deposit amount:");
				int depositAmt = input.nextInt();
				for(int i = 0; i < count; i++){
					if(accountName == account.get(i).get(i)){
						accountBalance.add(depositAmt);
						System.out.print(accountBalance);
						break;
					}
				}
				break;
			case 2:
				System.out.println("enter withdrawal amount:");
				int mainBalance = 0;
				int withdrawAmt = input.nextInt();
				if(accountBalance.get(0) <= 0 && accountBalance.get(0) <= withdrawAmt){
					System.out.print("your balance is too low, Add money to your account");
				}else{
					for(int j = 0; j < count; j++){
						if(accountName == account.get(j).get(j)){
							mainBalance = accountBalance.get(j);
							mainBalance = mainBalance - withdrawAmt;
							accountBalance.add(mainBalance);
							System.out.print(accountBalance[j]);
						}
					}
				}
				break;
			case 3:
				System.out.println("enter account name:");
				String enterName = input.next();
				System.out.println("enter transfer amount:");
				transferAmt = input.nextInt();
				for(int a = 0; a < count; a++){
				if(enterName == account.get(a).get(a)){
					if(accountBalance.get(a) <= 0){
						System.out.print("your balance is too low");
					}else if(accountBalance.get(a) < transferAmt){
						System.out.print("your balance is too low");
					}else{
					transferDone = accountBalance.get(a) - transferAmt;
					accountBalance.get(1) = transferDone;
					System.out.println(accountBalance.get(1));
					}
				}
				}
				break;
			case 4:
				System.out.print(accountBalance.get(1));
				break;
		}

		System.out.print(profile1AccountBalance);
		System.out.print("Do you want to continue? ");

		
	


	}



}