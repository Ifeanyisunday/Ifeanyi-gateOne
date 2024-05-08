import java.util.Scanner;
public class TaskSeven{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int evenSum = 0;
	int scoreNumber = 10;
	int index = 1;
	for(int counter = 1; counter <= scoreNumber; counter++){
		int scoreCollector = input.nextInt();
		if(counter % 2 == 0){
			evenSum += scoreCollector;
			index++;
		}
	}

	double average = evenSum / index;
	
	System.out.print("the average of sum of even numbers is " + average);
	System.out.print("the sum of even numbers is " + evenSum);

	}




}