import java.util.Scanner;
public class TaskTen{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int scoreNumber = 10;
	int index = 1;
	for(int counter = 1; counter <= scoreNumber; counter++){
		int scoreCollector = input.nextInt();
		if(scoreCollector >= 0 && scoreCollector <= 100){
			sum += scoreCollector;
			index++;
		}
	}

	double average = sum / (double)index
	System.out.print("the average of is " + average);

	}




}