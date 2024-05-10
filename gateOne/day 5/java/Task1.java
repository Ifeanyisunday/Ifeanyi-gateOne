import java.util.Scanner;
public class Task1{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	String userInput = input.nextLine();

	System.out.print(cardCheck(userInput));

	}

	public static void cardCheck(numbers){
		int arrLength = numbers.length();
		long numberOtString = Long.parseLong(numbers);
		long[] array = new long[arrLength];

		int alpha1 = 0;
		int valid = 0;
		long numberRange = 1000000000000000000;
		long divisor = 10;
		
		for(int i = 0; i < arrLength; i++){

			array[0] = numberOtString / numberRange;
			divisor*= 10;
		}
		
		String alpha = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
		
		for(int i = 0; i < 26; i++){
			for(int j = 0; j < 26; j++){
				if(alpha[i] == numbers[j]){
					alpha1 += 1;
				}
			}
		}
				
		if(array[0] == 4 || array[0] == 5 || array[0] == 6){
			valid += 1;
		}
		if(alpha1 == 0){
			valid += 1;
		}
		if(arrLength == 19){
			valid += 1;
		}
		if(arrLength % 4 != 0){
			valid += 1;
		}

		if(valid == 4){
			System.out.print("Card is valid");
		}else{
			System.out.print("Card is not valid");
		}	



	}

}