import java.util.Scanner;
public class TaskNine{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int scoreNumber = 10;
	int count = 0;
	while(count < 10){
		int scoreCollector = input.nextInt();
		if(scoreCollector >= 0 && scoreCollector <= 100){
			sum += scoreCollector;
		}
		count++;
	}

	System.out.print("the sum of is " + sum);

	}




}