import java.util.Arrays;
import java.util.Scanner;
public class Task1{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		String[] box1 = new String[1];
		String[] box2 = new String[1];
		String[] box3 = new String[1];
		String[] box4 = new String[1];
		String[] box5 = new String[1];
		String[] box6 = new String[1];
		String[] box7 = new String[1];
		String[] box8 = new String[1];
		String[] box9 = new String[1];

		for(int index = 0; index < 9; index++){
			System.out.println("Enter X or O: ");
			String userInput = input.nextLine();

			System.out.println("Enter Box index: ");
			int boxNumber = input.nextInt();

			if(boxNumber == 1){
				box1[0] = userInput;
			}else if(boxNumber == 2){
				box2[0] = userInput;
			}else if(boxNumber == 3){
				box3[0] = userInput;
			}else if(boxNumber == 4){
				box4[0] = userInput;
			}else if(boxNumber == 5){
				box5[0] = userInput;
			}else if(boxNumber == 6){
				box6[0] = userInput;
			}else if(boxNumber == 7){
				box7[0] = userInput;
			}else if(boxNumber == 8){
				box8[0] = userInput;
			}else if(boxNumber == 9){
				box9[0] = userInput;
			}
			

			
			//String result = Arrays.toString(box1);
			//System.out.print(result);
		}
			String result1 = Arrays.toString(box1);
			String result2 = Arrays.toString(box2);
			String result3 = Arrays.toString(box3);
			String result4 = Arrays.toString(box4);
			String result5 = Arrays.toString(box5);
			String result6 = Arrays.toString(box6);
			String result7 = Arrays.toString(box7);
			String result8 = Arrays.toString(box8);
			String result9 = Arrays.toString(box9);
			System.out.print(result1);
			System.out.print(result2);
			System.out.println(result3);
			System.out.print(result4);
			System.out.print(result5);
			System.out.println(result6);
			System.out.print(result7);
			System.out.print(result8);
			System.out.print(result9);
			
	}



}