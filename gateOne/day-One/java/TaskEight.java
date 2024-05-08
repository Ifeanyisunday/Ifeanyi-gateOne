import java.util.Scanner;
public class TaskEight{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int scoreNumber = 10;
	for(int counter = 1; counter <= scoreNumber; counter++){
		int scoreCollector = input.nextInt();
		if(scoreCollector >= 0 && scoreCollector <= 100){
			sum += scoreCollector;
		}
	}

	System.out.print("the sum of is " + sum);

	}




}