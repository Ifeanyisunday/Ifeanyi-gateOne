import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class MenstralApp{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	String LastPeriod = input.nextLine();

		char charAtZero = LastPeriod.charAt(0);
		char charAtOne = LastPeriod.charAt(1);

		char charAtThree = LastPeriod.charAt(3);
		char charAtFour = LastPeriod.charAt(4);

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

	
	LocalDate periodDate = dateOf();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("03-may-2024");
	LocalDate period = LocalDate.parse(LastPeriod, formatter);
	
	System.out.println(period);
	

	}






}