import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
public class TestAge{

	String dateOfBirth = "07-08-1994";
 
	@Test
	public void testAge(){
		int calculateAge = Task1.findAge(dateOfBirth);
		int expected = 29;
		assertEquals(expected, calculateAge);
	}

}