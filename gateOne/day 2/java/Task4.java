import java.util.Arrays;
import java.util.Scanner;
public class Task4{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		int[] scoreArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String result = Arrays.toString(displayEvenIndex(scoreArray));
		System.out.println(result);
		
		

	}

	public static int[] displayEvenIndex(int[] numbers){
		int[] evenIndex = new int[(numbers.length + 1) / 2];
		int index = 0;
		for(int count = 0; count < numbers.length; count++){
				if(count % 2 == 0){
					evenIndex[index] = numbers[count];
					index++;
				}
		} 

		
		return evenIndex;
	}
}