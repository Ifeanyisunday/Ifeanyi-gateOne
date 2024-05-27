import java.util.*;
public class PhoneBook{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> lastName = new ArrayList<String>();
	ArrayList<String> phoneNo = new ArrayList<String>();


	}

public static void addContact(){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first name: ");
	String userFirstName = input.next();
	firstName.add(userFirstName); 
	System.out.println("Enter last name: ");
	String userLastName = input.next();
	lastName.add(userLastName);
	System.out.println("Enter phone number: ");
	String phoneNumber = input.next();
	phoneNo.add(phoneNumber); 
	System.out.println(">>>>>>>>> Contact saved successfully <<<<<<<<<<<");
	System.out.println("Do you want to add more contacts? ");
	String desicion = input.next();
	if(desicion.equalsIgnoreCase("yes")){
			menu();
	}
}


public static void findContactByPhoneNo(){
	System.out.println("Enter mobile number: ");
	String phoneNumber = input.next();
	for(int element = 0; element < phoneNo.length; element++){
		if(phoneNumber.equals(phoneNo[element])){
			System.out.println(firstName[element] + " " + lastName[element] + "\n" + phoneNo[element]);
		} 
	}
	System.out.println("Do you want to continue? ")
	String desicion2 = input.next();
	if(desicion2.equals("yes")){
		menu();
	}
}


public static void findContactByFirstName(){
	System.out.println("Enter first name: ");
	String userFirstName = input.next();
	for(int index = 0; index < firstName.length; index++){
		if(userFirstName.equals(firstName[index])){
			System.out.println(firstName[index] + " " + lastName[index] + "\n" + phoneNo[index]);
		} 
	}
	System.out.println("Do you want to continue? ")
	String desicion2 = input.next();
	if(desicion2.equals("yes")){
		menu();
	}
}

public static void findContactByLastName(){
	System.out.println("Enter last name: ");
	String userLastName = input.next();
	for(int index1 = 0; index1 < lastName.length; index1++){
		if(userLastName == lastName[index1]){
			System.out.println(firstName[index1] + " " + lastName[index1] + "\n" + phoneNo[index1]);
		} 
	}
	System.out.println("Do you want to continue? ")
	String desicion2 = input.next();
	if(desicion2.equals("yes")){
		menu();
	}
}


public static void editContact(){
	System.out.println("Enter contact first name: ");
	String contactName = input.next();
	for(int index2 = 0; index2 < firstName.length; index2++){
		if(contactName == firstName[index2]){
			System.out.println(firstName[index2] + " " + lastName[index2]);
			System.out.print("");
			System.out.println("Edit contact");
			System.out.println("Enter new first name: ");
			String newFirstName = input.next();
			firstName[index2] = newFirstName;
			
			System.out.println("Enter new last name: ");
			String newLastName = input.next();
			lastName[index2] = newLastName;

			System.out.println("Enter new phone number: ");
			String newPhoneNumber = input.next();
			phoneNo[index2] = newPhoneNumber;
		}
	}
	System.out.println("Do you want to continue? ")
	String desicion2 = input.next();
	if(desicion2.equals("yes")){
		menu();
	}
}






}