import java.util.*;
public class AtMachineApp{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		ArrayList<String>profile1 = new ArrayList<String>();

		ArrayList<String>profile2 = new ArrayList<String>();

		/*ArrayList<String>accoutLastName = new ArrayList<String>();

		ArrayList<String>accoutPin = new ArrayList<String>();*/

		ArrayList<ArrayList<String>>accountStore = new ArrayList<ArrayList<String>>();
		System.out.println("Create your profile");
		
		ArrayList<Integer>accountBalance = new ArrayList<Integer>();

			System.out.println("Enter first name:");
			String userInput = input.next();
			profile1.add(userInput);

			System.out.println("Enter last name:");
			String userInput2 = input.next();
			profile1.add(userInput2);

			System.out.println("Enter pin name:");
			String pin1 = input.next();
			profile1.add(pin1);

			accountStore.add(profile1);

			System.out.println("Do you want to create a new Account?");
			String createNew = input.next();

			if(createNew.equalsIgnoreCase("yes")){
				System.out.println("Enter first name:");
				String newUserInput = input.next();

				profile2.add(userInput);
				System.out.println("Enter last name:");
				String newUserInput2 = input.next();

				profile2.add(userInput2);
				System.out.println("Enter pin name:");
				String pin2 = input.next();

				profile2.add(pin2);
				accountStore.add(profile2);
			}
			
			int count = 1;
			for(int addAcct = 0; addAcct < accountStore.size(); addAcct++){
				accountBalance.add(count);
			}
					
		System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3. Transfer", "4. Check Balance");
		int index = input.nextInt();

		/*int transferAmt = 0;
		int transferDone = 0;*/
		int indexValue = 0;
		int withdrawIndex = 0;
		switch(index){
			case 1:
				System.out.println("Enter account first name:");
				String accountName = input.next();
				System.out.println("Enter deposit amount:");
				int depositAmt = input.nextInt();
				for(int i = 0; i < accountStore.size(); i++){
					for(int j = 0; j < accountStore.size(); j++){
						if(accountName == accountStore.get(i).get(j)){
							accountBalance.set(i, i + depositAmt);
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
				int withdrawAmt = input.nextInt();
				for(int a = 0; a < accountStore.size(); a++){
					for(int b = 0; b < accountStore.size(); b++){
						if(accountName1 == accountStore.get(a).get(b)){
							indexValue = accountBalance.get(b) - withdrawAmt;
							if(indexValue <= 0 || indexValue < withdrawAmt){
								System.out.print("your balance is too low, Add money to your account");
							}else{
								int withdrawBalance = accountBalance.set(b, withdrawIndex);
								System.out.println(accountBalance.get(a));
								break;
							}
						}
					}
				}
				break;
			case 3:
				System.out.println("enter your account name:");
				String enterName = input.next();
				System.out.println("enter transfer amount:");
				int transferAmt = input.nextInt();

				for(int c = 0; c < accountStore.size(); c++){
					for(int d = 0; d < accountStore.size(); d++){
						if(enterName == accountStore.get(d).get(0)){
							if(accountBalance.get(d) <= 0 || accountBalance.get(d) < transferAmt){
								System.out.println("your balance is too low, Add money to your account");
							}else{
								accountBalance.set(d, d - transferAmt);
								break;
							}
						}
					}
				}

				System.out.println("enter recipent name:");
				String recipent = input.next();

				for(int e = 0; e < 1; e++){
					for(int f = 0; f < accountStore.size(); f++){
						if(recipent == accountStore.get(f).get(0)){
							accountBalance.set(f, f + transferAmt);
						} 
					}
				}
				break;
			case 4:
				System.out.println("Enter account name:");
				String newAcctName = input.next();
				for(int g = 0; g < accountStore.size(); g++){
					for(int h = 0; h < accountStore.size(); h++){
						if(newAcctName == accountStore.get(h).get(0)){
							System.out.println(accountBalance.get(h));
						}
					}
				}
				break;
		}

		
		System.out.println(accountStore.get(0).get(0));
		System.out.print("Do you want to continue? ");

		
	


	}



}