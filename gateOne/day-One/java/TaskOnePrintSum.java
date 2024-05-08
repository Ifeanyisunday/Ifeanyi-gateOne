import java.util.Scanner;
public class TaskOnePrintSum{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	for(int counter = 1; counter <= 10; counter++){
		int scoreCollector = input.nextInt();
		sum += scoreCollector;
	}
	
	System.out.print(sum);

	}




}