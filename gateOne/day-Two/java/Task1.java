import java.util.Arrays;
import java.util.Scanner;
public class Task1{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		int[] scoreArray = new int[10];
		
		
		for(int count = 0; count < scoreArray.length; count++){
			System.out.println("enter score");
			int score = input.nextInt();
			scoreArray[count] = score;
		}

		String result = Arrays.toString(scoreArray);
		System.out.print(result);
	}
}