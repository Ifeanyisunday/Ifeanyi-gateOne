import java.util.*;
public class AtMachineApp1{
	public static void main(String... args){

		header();

		System.out.println("Create your account");
		Scanner input = new Scanner(System.in);

		String[][] profile = new String[2][3];
		
		int[] accountBalance = new int[2];

			System.out.println("Enter first name:");
			String userInput = input.next();
			profile[0][0] = userInput;

			System.out.println("Enter last name:");
			String userInput2 = input.next();
			profile[0][1] = userInput2;

			System.out.println("Enter pin");
			String pin1 = input.next();
			profile[0][2] = pin1;

			System.out.println("Do you want to create a new Account?");
			String createNew = input.next();

			if(createNew.equalsIgnoreCase("yes")){
				System.out.println("Enter first name:");
				String newUserInput = input.next();
				profile[1][0] = newUserInput;

				System.out.println("Enter last name:");
				String newUserInput2 = input.next();
				profile[1][1] = newUserInput2;

				System.out.println("Enter pin");
				String pin2 = input.next();
				profile[1][2] = pin2;

			}
					
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3. Transfer", "4. Check Balance", "5. Back to Main Menu");
		int index = input.nextInt();

		int indexValue = 0;
		int withdrawIndex = 0;
		switch(index){
			case 1:
				System.out.println("Enter account first name:");
				String accountName = input.next();
				System.out.println("Enter deposit amount:");
				int depositAmt = input.nextInt();
				for(int i = 0; i < profile.length; i++){
					for(int j = 0; j < profile.length; j++){
						if(accountName.equals(profile[i][j])){
							accountBalance[i] = accountBalance[i] + depositAmt;
							System.out.println("You just deposited " + accountBalance[i] + " naira");
							break;
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision1 = input.next();
				while(decision1.equals("yes")){
					menu(profile, accountBalance);
					decision1 = input.next();
				}
				break;
			case 2:
				System.out.println("Enter account first name:");
				String accountName1 = input.next();
				System.out.println("enter withdrawal amount:");
				int withdrawAmt = input.nextInt();
				for(int a = 0; a < profile.length; a++){
					for(int b = 0; b < profile.length; b++){
						if(accountName1.equals(profile[a][b])){
							if(accountBalance[a] <= 0 || accountBalance[a] < withdrawAmt){
								System.out.println("your balance is too low, Add money to your account");
								System.out.println("");
								System.out.println("press 1 to add or 2 to go back to menu");
								int addMoney1 = input.nextInt();
								switch(addMoney1){
									case 1:
										menu(profile, accountBalance);
										break;
									case 2:
										header();
										break;
								}
							}else{
								accountBalance[a] = accountBalance[a] - withdrawAmt;
								System.out.println("you have been debited " + withdrawAmt + " naira");
								System.out.println("your account balance is now " + accountBalance[a] + " naira");
								break;
							}
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision2 = input.next();
				while(decision2.equals("yes")){
					menu(profile, accountBalance);
					decision2 = input.next();
				}
				break;
			case 3:
				System.out.println("enter your account name:");
				String enterName = input.next();
				System.out.println("enter transfer amount:");
				int transferAmt = input.nextInt();

				for(int c = 0; c < profile.length; c++){
					for(int d = 0; d < profile.length; d++){
						if(enterName.equals(profile[c][d])){
							if(accountBalance[c] <= 0 || accountBalance[c] < transferAmt){
								System.out.println("your balance is too low, Add money to your account");
								System.out.println("");
								System.out.println("press 1 to add or 2 to go back to menu");
								int addMoney = input.nextInt();
								switch(addMoney){
									case 1:
										menu(profile, accountBalance);
										break;
									case 2:
										header();
										break;
								}
							}else{
								accountBalance[c] = accountBalance[c] - transferAmt;
								break;
							}
						}
					}
				}

				System.out.println("enter recipent name:");
				String recipent = input.next();

				for(int e = 0; e < profile.length; e++){
					for(int f = 0; f < profile.length; f++){
						if(recipent.equals(profile[e][f])){
							accountBalance[e] = accountBalance[e] + transferAmt;
							System.out.println("Dear " + recipent + " you just received " + transferAmt + " from " + enterName);
							System.out.println("your account balance is now " + accountBalance[e] + " naira");
							break;
						} 
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision3 = input.next();
				while(decision3.equals("yes")){
					menu(profile, accountBalance);
					decision3 = input.next();
				}
				break;
			case 4:
				System.out.println("Enter account name:");
				String newAcctName = input.next();
				for(int g = 0; g < profile.length; g++){
					for(int h = 0; h < profile.length; h++){
						if(newAcctName.equals(profile[g][h])){
							System.out.println(accountBalance[g]);
							break;
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to do something else? ");
				String decision4 = input.next();
				while(decision4.equals("yes")){
					menu(profile, accountBalance);
					decision4 = input.next();
				}
				break;
			case 5:
				header();
				break;
				

		}

	}


	


	public static void header(){

		System.out.println("===============================");

		System.out.println("WELCOME TO BANKE BANK");

		System.out.println("===============================");

	}


	public static void menu(String[][] profile, int[]accountBalance){

		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "Choose Transaction type:", "1. Deposit", "2. Withdraw", "3. Transfer", "4. Check Balance", "5. Back to Main Menu");
		int index = input.nextInt();

		int indexValue = 0;
		int withdrawIndex = 0;
		switch(index){
			case 1:
				System.out.println("Enter account first name:");
				String accountName = input.next();
				System.out.println("Enter deposit amount:");
				int depositAmt = input.nextInt();
				for(int i = 0; i < profile.length; i++){
					for(int j = 0; j < profile.length; j++){
						if(accountName.equals(profile[i][j])){
							accountBalance[i] = accountBalance[i] + depositAmt;
							System.out.println("You just deposited " + accountBalance[i] + " naira");
							break;
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision = input.next();
				while(decision.equalsIgnoreCase("yes")){
					menu(profile, accountBalance);
					decision = input.next();
				}
				break;
			case 2:
				System.out.println("Enter account first name:");
				String accountName1 = input.next();
				System.out.println("enter withdrawal amount:");
				int withdrawAmt = input.nextInt();
				for(int a = 0; a < profile.length; a++){
					for(int b = 0; b < profile.length; b++){
						if(accountName1.equals(profile[a][b])){
							if(accountBalance[a] <= 0 || accountBalance[a] < withdrawAmt){
								System.out.println("your balance is too low, Add money to your account");
								System.out.println("");
								System.out.println("press 1 to add or 2 to go back to menu");
								int addMoney1 = input.nextInt();
								switch(addMoney1){
									case 1:
										menu(profile, accountBalance);
										break;
									case 2:
										header();
										break;
								}
							}else{
								accountBalance[a] = accountBalance[a] - withdrawAmt;
								System.out.println("you have been debited " + withdrawAmt + " naira");
								System.out.println("your account balance is now " + accountBalance[a] + " naira");
								break;
							}
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision2 = input.next();
				while(decision2.equals("yes")){
					menu(profile, accountBalance);
					decision2 = input.next();
				}
				break;
			case 3:
				System.out.println("enter your account name:");
				String enterName = input.next();
				System.out.println("enter transfer amount:");
				int transferAmt = input.nextInt();

				for(int c = 0; c < profile.length; c++){
					for(int d = 0; d < profile.length; d++){
						if(enterName.equals(profile[c][d])){
							if(accountBalance[c] <= 0 || accountBalance[c] < transferAmt){
								System.out.println("your balance is too low, Add money to your account");
								System.out.println("");
								System.out.println("press 1 to add or 2 to go back to menu");
								int addMoney = input.nextInt();
								switch(addMoney){
									case 1:
										menu(profile, accountBalance);
										break;
									case 2:
										header();
										break;
								}
							}else{
								accountBalance[c] = accountBalance[c] - transferAmt;
								break;
							}
						}
					}
				}

				System.out.println("enter recipent name:");
				String recipent = input.next();

				for(int e = 0; e < profile.length; e++){
					for(int f = 0; f < profile.length; f++){
						if(recipent.equals(profile[e][f])){
							accountBalance[e] = accountBalance[e] + transferAmt;
							System.out.println("Dear " + recipent + " you just received " + transferAmt + " from " + enterName);
							System.out.println("your account balance is now " + accountBalance[e] + " naira");
							break;
						} 
					}
				}
				System.out.println("");
				System.out.print("Do you want to continue? ");
				String decision3 = input.next();
				while(decision3.equals("yes")){
					menu(profile, accountBalance);
					decision3 = input.next();
				}
				break;
			case 4:
				System.out.println("Enter account name:");
				String newAcctName = input.next();
				for(int g = 0; g < profile.length; g++){
					for(int h = 0; h < profile.length; h++){
						if(newAcctName.equals(profile[g][h])){
							System.out.println(accountBalance[g] + " naira");
							break;
						}
					}
				}
				System.out.println("");
				System.out.print("Do you want to do something else? ");
				String decision4 = input.next();
				while(decision4.equals("yes")){
					menu(profile, accountBalance);
					decision4 = input.next();
				}
				break;
			case 5:
				header();
				break;
		}







	}



}