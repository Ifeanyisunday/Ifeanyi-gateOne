import java.util.Arrays;
import java.util.Scanner;
public class Task2{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		int[] scoreArray = new int[10];
		
		
		for(int count = 0; count < scoreArray.length; count++){
			System.out.println("enter score");
			int score = input.nextInt();
			scoreArray[count] = score;

		}
		
		String arraySave = new String[1];
		for(int count = 0; count < scoreArray.length; count++){
			arraySave[0] = scoreArray[count];
			String result = Arrays.toString(arraySave);
			
			System.out.println(result);

		}
		
		
		

	}
}