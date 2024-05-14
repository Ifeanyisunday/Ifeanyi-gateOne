import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		ArrayList<String>accoutFirstName = new ArrayList<String>();
		ArrayList<String>accoutLastName = new ArrayList<String>();
		ArrayList<String>accoutPin = new ArrayList<String>();

		ArrayList<ArrayList<String>>accountStore = new ArrayList();
		System.out.println("Create your profile");
		
		String createNew;
		int count = 1;
		do{
			System.out.println("Enter first name:");
			String userInput = input.next();
			accoutFirstName.add(userInput);
			System.out.println("Enter last name:");
			String userInput2 = input.next();
			accoutLastName.add(userInput2);
			System.out.println("Enter pin name:");
			String pin1 = input.next();
			accoutPin.add(pin1);
			
			accountStore.add(accoutFirstName);
			accountStore.add(accoutLastName);
			accountStore.add(accoutPin);
			System.out.println("Do you want to create new Account?");
			createNew = input.next();
			count++;
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
				for(int i = 0; i < 1; i++){
					for(int j = 0; j < accountStore.size(); j++){
						if(accountName == accountBalance.get(j).get(0)){
							accountBalance.set(j, j + depositAmt);
							System.out.print(accountBalance.get(j));
							break;
						}
					}
				}
				break;
			case 2:
				System.out.println("Enter account first name:");
				String accountName1 = input.next();
				System.out.println("enter withdrawal amount:");
				int mainBalance = 0;
				int withdrawAmt = input.nextInt();
				for(int a = 0; a < 1; a++){
					for(int b = 0; b < accountBalance.size(); b++){
						if(accountName1 == accountBalance.get(b)){
							if(accountBalance.get(b) <= 0 || accountBalance.get(b) < withdrawAmt){
								System.out.print("your balance is too low, Add money to your account");
							}else{
								accountBalance.set(b, b - withdrawAmt);
								System.out.print(accountBalance.get(b));
								break;
							}
						}
					}
				}
				break;
			case 3:
				System.out.println("enter your account name:");
				String enterName = input.next();

				System.out.println("enter recipent name:");
				String recipent = input.next();
				System.out.println("enter transfer amount:");
				transferAmt = input.nextInt();

				
				for(int c = 0; c <= range1; c++){
				if(enterName == accountBalance.get(b).get(a)){
					if(accountBalance.get(a) <= 0){
						System.out.print("your balance is too low");
					}else if(accountBalance.get(a) < transferAmt){
						System.out.print("your balance is too low");
					}else{
					transferDone = accountBalance.get(a) - transferAmt;
					}
				}
				range1++;
				}

				int range2 = 0;
				for(int b = 0; b < range2; b++){
				if(recipent == account.get(a).get(a)){
					accountBalance.get(1) = transferDone;
					System.out.println(accountBalance.get(1));
				}
				range2++;
				}
				break;
			case 4:
				System.out.print(accountBalance.get(0));
				break;
		}

		System.out.print(accountBalance.get(0));
		System.out.print("Do you want to continue? ");

		
	


	}



}