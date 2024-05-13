import java.util.ArrayList;
import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Hello, Kindly Enter Card details to verify");
	String creditNumber = input.next();
	
	
	if(creditNumber.charAt(0) == '4'){
		System.out.println("Credit card Type: Visa Cards");
		System.out.println("Credit card Number: " + creditNumber);
		System.out.println("Credit card Digit Length: " + creditNumber.length());
	}else if(creditNumber.charAt(0) == '5'){
		System.out.println("Credit card Type: MasterCard");
		System.out.println("Credit card Number: " + creditNumber);
		System.out.println("Credit card Digit Length: " + creditNumber.length());
	}else if(creditNumber.charAt(0) == '3' && creditNumber.charAt(1) == '7'){
		System.out.println("Credit card Type: American Express Card");
		System.out.println("Credit card Number: " + creditNumber);
		System.out.println("Credit card Digit Length: " + creditNumber.length());
	}else if(creditNumber.charAt(0) == '6'){
		System.out.println("Credit card Type: Discover Cards");
		System.out.println("Credit card Number: " + creditNumber);
		System.out.println("Credit card Digit Length: " + creditNumber.length());
	}else{
		while(true){
			System.out.println("Credit card Type: Invaild card!");
			System.out.println("Credit card Number: " + creditNumber);
			System.out.println("Credit card Digit Length: " + creditNumber.length());
			System.out.println("Credit Card Validity Status: Invalid");
			enterCreditDetails();
		}
	}

	
if(creditNumber.length() < 16){
		System.out.println("Credit card Type: Invaild card!");
		System.out.println("Credit card Number: " + creditNumber);
		System.out.println("please enter valid card number");
		System.out.println("Credit Card Validity Status: Invalid");
		enterCreditDetails();
}

	long stringToNumbers = Long.parseLong(creditNumber);
	int[] arrayOfStringNumbers = new int[creditNumber.length()];

	for(int count = arrayOfStringNumbers.length - 1; count >= 0; count--){
		arrayOfStringNumbers[count] = (int)(stringToNumbers % 10);
		stringToNumbers = stringToNumbers / 10;
        }


        int sum1 = 0;
	int firstNumber = 0;
	int secondNumber = 0;
	int multiply = 0;
	int sumDoubleDigits = 0;
	

	for(int i = arrayOfStringNumbers.length - 2; i >= 0; i-=2){
		multiply = arrayOfStringNumbers[i] * 2;

		if(multiply > 9){
			firstNumber = multiply / 10;
                        secondNumber = multiply % 10;
 			sumDoubleDigits = firstNumber + secondNumber;
			sum1 += sumDoubleDigits;	
		}else if(multiply <= 9){
			sum1 += multiply;
		}
	}



	
	int sumOddPlaces = 0;
	for(int i = arrayOfStringNumbers.length - 1; i >= 0; i-=2){
		if(i % 2 != 0){
			sumOddPlaces += arrayOfStringNumbers[i];
		}	
	}


	int sumAll = sum1 + sumOddPlaces;

	if(sumAll % 10 == 0){
		System.out.println("Credit Card Validity Status: Valid");
	}else{
		System.out.println("Credit Card Validity Status: Invalid");	
	}

}


public static void enterCreditDetails(){

	Scanner input = new Scanner(System.in);
	System.out.println("Hello, Kindly Enter Card details to verify");
	String creditNumber = input.nextLine();
}


}