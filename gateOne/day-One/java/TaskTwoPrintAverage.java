import java.util.Scanner;
public class TaskTwoPrintAverage{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int scoreNumber = 10;
	for(int counter = 1; counter <= scoreNumber; counter++){
		int scoreCollector = input.nextInt();
		sum += scoreCollector;
	}

	double average = sum / (double)scoreNumber;
	
	System.out.print(average);

	}




}