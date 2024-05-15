import java.time.*;
import java.util.*;
public class MenstralApp{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	LocalDate LastPeriod = LocalDate.of(2024, 04, 23);
	LocalDate current = LocalDate.now();
	Period difference = Period.between(begin, current);
	int result = difference.getDays();

	System.out.println(result);
	/*String userName = input.nextLine();
	String dateOfLastPeriod = input.nextLine();*/
	
	
	

	}
}