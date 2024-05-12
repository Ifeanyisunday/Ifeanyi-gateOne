import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
public class TestAge{

	String dateOfBirth = "11-12-2021";
 
	@Test
	public void testAge(){
		int calculateAge = Task1.findAge(dateOfBirth);
		int expected = 2;
		assertEquals(expected, calculateAge);
	}

}