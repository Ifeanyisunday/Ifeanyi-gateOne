import java.util.Arrays;
import java.util.Scanner;
public class Task5{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		int[] scoreArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String result = Arrays.toString(displayOddIndex(scoreArray));
		System.out.println(result);
		
		

	}

	public static int[] displayOddIndex(int[] numbers){
		int[] oddIndex = new int[numbers.length / 2];
		
		int index = 0;
		for(int count = 0; count < numbers.length; count++){
				if(count % 2 != 0){
					oddIndex[index] = numbers[count];
					index++;
				}
		} 

		return oddIndex;
	}
}