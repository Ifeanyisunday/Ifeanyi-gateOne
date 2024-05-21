import java.util.*;
public class Atm{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.println("==============================");
	System.out.println("WELCOME TO BANKE BANK");
	System.out.println("==============================");
	System.out.println("");

	ArrayList<String>profileName = new ArrayList<String>();
	ArrayList<String>phoneNo = new ArrayList<String>();
	ArrayList<String>pin = new ArrayList<String>();
	ArrayList<Integer>accountBalance = new ArrayList<Integer>();
	System.out.println("""
	CHOOSE TRANSACTION TYPE,
	1 -> Create Account
	2 -> Deposit
	3 -> Withdraw
	4 -> Transfer
	5 -> Change pin
	6 -> Check Balance
	7 -> Back to Main Menu
	""");
	
	int select = input.nextInt();
	switch(select){
		case 1:
			String createNewAccount;
			do{
			profileName.add(createAccountName());
			phoneNo.add(phoneNumber());
			pin.add(createPin());
			accountBalance.add(0);
			System.out.println(">>>>>>>>Account created successfully>>>>>>>>>>");
			System.out.println("Do you want to create a new Account?");
			createNewAccount = input.next();
			}while(createNewAccount.equalsIgnoreCase("yes"));
			System.out.println("Do you want to continue?");
			String desicion = input.next();
			if(desicion.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 2:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name2 = input.nextLine();
			System.out.println("Enter deposit amount:");
			int userDepositAmount = input.nextInt();
			for(int count2 = 0; count2 < accountBalance.size(); count2++){
					if(name2.equals(profileName.get(count2))){
						int addDeposit = accountBalance.get(count2) + userDepositAmount;
						accountBalance.set(count2, addDeposit);
						System.out.println("Your just deposited " + userDepositAmount);
						System.out.println("Your account balance is " + accountBalance.get(count2));
					}
			}
			System.out.println("Do you want to continue?");
			String desicion2 = input.next();
			if(desicion2.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);	
			}
			break;
		case 3:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name3 = input.nextLine();
			System.out.println("Enter withdraw amount:");
			int userWithdrawAmount = input.nextInt();
			for(int count3 = 0; count3 < accountBalance.size(); count3++){
					if(name3.equals(profileName.get(count3))){
						int addWithdraw = accountBalance.get(count3) - userWithdrawAmount;
						accountBalance.set(count3, addWithdraw);
						System.out.println("Your have been debited " + userWithdrawAmount);
						System.out.println("Your account balance is " + accountBalance.get(count3));
					}
			}
			System.out.println("Do you want to continue?");
			String desicion3 = input.next();
			if(desicion3.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 4:
			System.out.println("Enter Recipent account name: ");
			input.nextLine();
			String enterRecipentName = input.nextLine();
			System.out.println("Enter your account name: ");
			String name4 = input.nextLine();
			System.out.println("Enter transfer amount:");
			int userTransferAmount = input.nextInt();
			int balance = 0;
			for(int index4 = 0; index4 < accountBalance.size(); index4++){
					if(name4.equals(profileName.get(index4))){
						balance = accountBalance.get(index4) - userTransferAmount;
						accountBalance.set(index4, balance);
					}
			}

			int balance2 = 0;
			for(int count4 = 0; count4 < accountBalance.size(); count4++){
				if(enterRecipentName.equals(profileName.get(count4))){
						balance2 = accountBalance.get(count4) + userTransferAmount;
						accountBalance.set(count4, balance2);
						System.out.println("Dear " + enterRecipentName + " You just received " + userTransferAmount + " from " + name4);
				}
			}
			System.out.println("Do you want to continue?");
			String desicion4 = input.next();
			if(desicion4.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 5:
			System.out.println("Enter old pin: ");
			String oldPin = input.next();
			String newPin;
			for(int index5 = 0; index5 < accountBalance.size(); index5++){
					if(oldPin.equals(pin.get(index5))){
						System.out.println("Enter new pin: ");
						newPin = input.next();
						pin.set(index5, newPin);
						System.out.println("Your new pin is " + pin.get(index5));
						break;
					}
			}
			System.out.println("Do you want to create a new Account?");
			String desicion5 = input.next();
			if(desicion5.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 6:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name6 = input.nextLine();;
			for(int index6 = 0; index6 < accountBalance.size(); index6++){
					if(name6.equals(profileName.get(index6))){
						System.out.println("Your account balance is " + accountBalance.get(index6));
					}
			}
			System.out.println("Do you want to create a new Account?");
			String desicion6 = input.next();
			if(desicion6.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 7:
			menu(profileName, phoneNo, pin, accountBalance);
			break;
			
	}

}



public static void menu(ArrayList<String>profileName, ArrayList<String>phoneNo, ArrayList<String>pin, ArrayList<Integer>accountBalance){
	Scanner input = new Scanner(System.in);

	System.out.println("""
	CHOOSE TRANSACTION TYPE,
	1 -> Create Account
	2 -> Deposit
	3 -> Withdraw
	4 -> Transfer
	5 -> Change pin
	6 -> Check Balance
	7 -> Back to Main Menu
	""");
	
	int select = input.nextInt();
	switch(select){
		case 1:
			String createNewAccount;
			do{
			profileName.add(createAccountName());
			phoneNo.add(phoneNumber());
			pin.add(createPin());
			accountBalance.add(0);
			System.out.println(">>>>>>>>Account created successfully>>>>>>>>>>");
			System.out.println("Do you want to create a new Account?");
			createNewAccount = input.next();
			}while(createNewAccount.equalsIgnoreCase("yes"));
			System.out.println("Do you want to continue?");
			String desicion = input.next();
			if(desicion.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 2:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name2 = input.nextLine();
			System.out.println("Enter deposit amount:");
			int userDepositAmount = input.nextInt();
			for(int count2 = 0; count2 < accountBalance.size(); count2++){
					if(name2.equals(profileName.get(count2))){
						int addDeposit = accountBalance.get(count2) + userDepositAmount;
						accountBalance.set(count2, addDeposit);
						System.out.println("Your just deposited " + userDepositAmount);
						System.out.println("Your account balance is " + accountBalance.get(count2));
					}
			}
			System.out.println("Do you want to continue?");
			String desicion2 = input.next();
			if(desicion2.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);	
			}
			break;
		case 3:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name3 = input.nextLine();
			System.out.println("Enter withdraw amount:");
			int userWithdrawAmount = input.nextInt();
			for(int count3 = 0; count3 < accountBalance.size(); count3++){
					if(name3.equals(profileName.get(count3))){
						int addWithdraw = accountBalance.get(count3) - userWithdrawAmount;
						accountBalance.set(count3, addWithdraw);
						System.out.println("Your have been debited " + userWithdrawAmount);
						System.out.println("Your account balance is " + accountBalance.get(count3));
					}
			}
			System.out.println("Do you want to continue?");
			String desicion3 = input.next();
			if(desicion3.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 4:
			System.out.println("Enter Recipent account name: ");
			input.nextLine();
			String enterRecipentName = input.nextLine();
			System.out.println("Enter your account name: ");
			String name4 = input.nextLine();
			System.out.println("Enter transfer amount:");
			int userTransferAmount = input.nextInt();
			int balance = 0;
			for(int index4 = 0; index4 < accountBalance.size(); index4++){
					if(name4.equals(profileName.get(index4))){
						balance = accountBalance.get(index4) - userTransferAmount;
						accountBalance.set(index4, balance);
					}
			}

			int balance2 = 0;
			for(int count4 = 0; count4 < accountBalance.size(); count4++){
				if(enterRecipentName.equals(profileName.get(count4))){
						balance2 = accountBalance.get(count4) + userTransferAmount;
						accountBalance.set(count4, balance2);
						System.out.println("Dear " + enterRecipentName + " You just received " + userTransferAmount + " from " + name4);
				}
			}
			System.out.println("Do you want to continue?");
			String desicion4 = input.next();
			if(desicion4.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 5:
			System.out.println("Enter old pin: ");
			String oldPin = input.next();
			String newPin;
			for(int index5 = 0; index5 < accountBalance.size(); index5++){
					if(oldPin.equals(pin.get(index5))){
						System.out.println("Enter new pin: ");
						newPin = input.next();
						pin.set(index5, newPin);
						System.out.println("Your new pin is " + pin.get(index5));
						break;
					}
			}
			System.out.println("Do you want to create a new Account?");
			String desicion5 = input.next();
			if(desicion5.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 6:
			System.out.println("Enter account name: ");
			input.nextLine();
			String name6 = input.nextLine();;
			for(int index6 = 0; index6 < accountBalance.size(); index6++){
					if(name6.equals(profileName.get(index6))){
						System.out.println("Your account balance is " + accountBalance.get(index6));
					}
			}
			System.out.println("Do you want to create a new Account?");
			String desicion6 = input.next();
			if(desicion6.equalsIgnoreCase("yes")){
				menu(profileName, phoneNo, pin, accountBalance);
			}
			break;
		case 7:
			menu(profileName, phoneNo, pin, accountBalance);
			break;
			
	}

}









public static int balance;

public static void deposit(int number){
	if (number > 0) {
            balance += number;
            System.out.println("Deposited: $" + number);
        } else {
            System.out.println("Invalid deposit amount.");
        }
}

public static void withdraw(int number){
	 if (number > 0 && number <= balance) {
            balance -= number;
            System.out.println("Withdrew: $" + number);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
}

public static int getBalance(){
	return balance;
}

public static String createAccountName(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first name and last name: ");
	String userNames = input.nextLine();
	return userNames;
}

public static String phoneNumber(){
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter your phone number: ");
	String userPhoneNumber = input.nextLine();
	return userPhoneNumber;
}

public static String createPin(){
	Scanner input = new Scanner(System.in);
	System.out.println("Create pin: ");
	String userPin = input.nextLine();
	int pinLength = userPin.length();
	if(pinLength < 4 || pinLength > 4){
		throw new IllegalArgumentException("Wrong pin!!! logging out");
	}else{
	return userPin;
	}
}

}