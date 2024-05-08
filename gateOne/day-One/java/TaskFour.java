import java.util.Scanner;
public class TaskFour{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sumIndex = 0;
	int scoreNumber = 10;
	for(int counter = 1; counter <= scoreNumber; counter++){
		int scoreCollector = input.nextInt();
		if(counter % 2 == 0){
			sumIndex += counter;
		}
	}
	
	System.out.print("the sum is of even is " + sumIndex);

	}




}