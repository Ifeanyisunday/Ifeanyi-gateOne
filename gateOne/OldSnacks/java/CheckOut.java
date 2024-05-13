import java.util.Scanner;
import java.util.ArrayList;

public class CheckOut{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("What is the customer's Name?: ");
	String name = input.nextLine();

	String decision; 
	ArrayList<String>storeItem = new ArrayList<String>();
	ArrayList<Integer>storeQuantity = new ArrayList<Integer>();
	ArrayList<Float>totalPrice = new ArrayList<Float>();
	ArrayList<Float>total = new ArrayList<Float>();
	float totalAmount1 = 0;
	int count = 0;
	System.out.print("");
	do{
		System.out.print("");
		System.out.println("What did the user buy?: ");
		String item = input.next();
		storeItem.add(item); 
		count += 1;

		System.out.println("How many peices?: ");
		int quantity = input.nextInt();
		storeQuantity.add(quantity);

		System.out.println("How many unit?: ");
		float price = input.nextFloat();
		totalAmount1 += price * quantity;
		totalPrice.add(price);		

		System.out.println("Add more items?: ");
		decision = input.next();

		total.add(quantity * price);
	}while(decision.equalsIgnoreCase("yes"));
	 

	System.out.print("");
	System.out.println("What is your Name?: ");
	String cashierName = input.next();
	System.out.print("");
	System.out.println("How much discount will he/she get?: ");
	int discountRate = input.nextInt();
	System.out.print("");
	float getDiscount = totalAmount1 * discountRate / 100;
	double vat = totalAmount1 * 17.50 / 100; 

	

	System.out.print("");
	System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%s%n%s%s%n", "SEMICOLON STORES","MAIN BRANCH", "LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.", "TEL: 03293828343", "Date : 18-Dec-24 8:48:11pm", "Cashier : ", cashierName, "Customer Name: ", name);
	System.out.println("===========================================================================================================================================================================================================================");
	
	System.out.printf("%s%7s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	int i = 0;
	while(i < count){
		System.out.printf("%s", storeItem.get(i));
		System.out.printf("%7d", storeQuantity.get(i));
		System.out.printf("%13.2f", totalPrice.get(i));
		System.out.printf("%13.2f", total.get(i));
		System.out.println();
		i++;
	}
	

	System.out.printf("%s%12.2f%n", "Sub-total:", totalAmount1);
	System.out.printf("%s%12.2f%n", "Discount:", getDiscount);
	System.out.printf("%s%10.2f%n", "VAT @17.50:", vat);
	
	System.out.println("===========================================================================================================================================================================================================================");
	double totalBill = totalAmount1 + vat - getDiscount;
	System.out.printf("%s%15.2f%n", "Bill Total:", totalBill);
	System.out.println("===========================================================================================================================================================================================================================");
	System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + totalBill);
	System.out.println("===========================================================================================================================================================================================================================");




	System.out.println("How much did the customer give to you?: ");
	double customerCash = input.nextDouble();
	double balance = customerCash - totalBill;

	System.out.print("");
	System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%s%n%s%s%n", "SEMICOLON STORES","MAIN BRANCH", "LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.", "TEL: 03293828343", "Date : 18-Dec-24 8:48:11pm", "Cashier : ", cashierName, "Customer Name: ", name);
	System.out.println("===========================================================================================================================================================================================================================");
	
	System.out.printf("%s%7s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	int j = 0;
	while(j < count){
		System.out.printf("%s", storeItem.get(j));
		System.out.printf("%7d", storeQuantity.get(j));
		System.out.printf("%13.2f", totalPrice.get(j));
		System.out.printf("%13.2f", total.get(j));
		System.out.println();
		j++;
	}

	System.out.printf("%s%12.2f%n", "Sub-total:", totalAmount1);
	System.out.printf("%s%12.2f%n", "Discount:", getDiscount);
	System.out.printf("%s%10.2f%n", "VAT @17.50:", vat);
	
	System.out.println("===========================================================================================================================================================================================================================");
	System.out.printf("%s%15.2f%n", "Bill Total: ", totalBill);
	System.out.printf("%s%15.2f%n", "Amount Paid: ", customerCash);
	System.out.printf("%s%15.2f%n", "Balance: ", balance);
	System.out.println("===========================================================================================================================================================================================================================");
	System.out.println("THANK YOU FOR YOUR PATRONAGE");
	System.out.println("===========================================================================================================================================================================================================================");

	
}

}