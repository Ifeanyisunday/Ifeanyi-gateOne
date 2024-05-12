import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class Task1{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter date of birth: ");
		String age = input.nextLine();
		
		int result = findAge(age);
		System.out.print("You are " + result + "years old");
	}
	
	public static int findAge(String numbers){

		char charAtZero = numbers.charAt(0);
		char charAtOne = numbers.charAt(1);

		char charAtThree = numbers.charAt(3);
		char charAtFour = numbers.charAt(4);

		char charAtSix = numbers.charAt(6);
		char charAtSeven = numbers.charAt(7);
		char charAtEight = numbers.charAt(8);
		char charAtNine = numbers.charAt(9);


		int day1 = Integer.parseInt(String.valueOf(charAtZero));
		int day2 = Integer.parseInt(String.valueOf(charAtOne));

		int month1 = Integer.parseInt(String.valueOf(charAtThree));
		int month2 = Integer.parseInt(String.valueOf(charAtFour));

		int year1 = Integer.parseInt(String.valueOf(charAtSix));
		int year2 = Integer.parseInt(String.valueOf(charAtSeven));
		int year3 = Integer.parseInt(String.valueOf(charAtEight));
		int year4 = Integer.parseInt(String.valueOf(charAtNine));


		int getDate = 0;
		int getMonth = 0;
		int getYear = 0;

		if(day1 >= 1){
			getDate =  (day1 * 10) + day2;	
		}else{
			getDate = day2;
		}

		if(month1 >= 1){
			getMonth =  (month1 * 10) + month2;	
		}else{
			getMonth = month2;
		}

		if(year1 >= 1){
			getYear =  (year1 * 1000) + (year2 * 100) + (year3 * 10) + year4 ;	
		}else{
			getYear = year4;
		}

		LocalDate begin = LocalDate.of(getYear, getMonth, getDate);
		LocalDate end = LocalDate.now();

		Period difference = Period.between(begin, end);

		int years = difference.getYears();

		return years;

	}
	

}