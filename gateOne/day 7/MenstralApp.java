import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.*;
public class MenstralApp{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
		System.out.println("Enter date of last period:");
		String enterLastPeriod = input.next();

		System.out.println("Enter your flow circle:");
		int cycleLength = input.nextInt();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate getLastPeriod = LocalDate.parse(enterLastPeriod, format);
		
		LocalDate dateOfNextPeriod = getLastPeriod.plusDays(cycleLength);
		LocalDate startOfOvulation = dateOfNextPeriod.minusDays(14);

		LocalDate fertilityPeriod1 = startOfOvulation.minusDays(5);
		LocalDate fertilityPeriod2 = startOfOvulation.plusDays(1);

		LocalDate safe1 = getLastPeriod.plusDays(1);
		LocalDate safe2 = fertilityPeriod1.minusDays(1);

		LocalDate safe3 = fertilityPeriod2.plusDays(1);
		LocalDate safe4 = dateOfNextPeriod.minusDays(1);

		
		
		
		System.out.println("Your next period will come on the " + dateOfNextPeriod);
		System.out.println("Your ovulation date is " + startOfOvulation);
		System.out.println("Your fertility period is between " + fertilityPeriod1 + fertilityPeriod2);
		System.out.println("Your safe period is between " + safe1 + " - " + safe2 + " and " + safe3 + " - " + safe4);
		
		

	}


}