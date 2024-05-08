import java.util.Random;
import java.util.Scanner;
public class Task1{
	public static void main(String... args){
	Random secureRandom = new Random();
	Scanner input = new Scanner(System.in);

	int correctAnswers = 0;
	int inCorrectAnswers = 0;
	for(int count = 0; count < 10; count++){
		int firstNumber = secureRandom.nextInt(-10, 10);
		int secondNumber = secureRandom.nextInt(-10, 10);
		String operand = "+";
		int answer = 0;
		if(operand == "+"){
			answer = firstNumber + secondNumber;
		}

		
				
		System.out.print(firstNumber + " " + operand + " " + secondNumber + "= ");
		int userAnswer = input.nextInt();

		if(answer == userAnswer){
			correctAnswers += 1;
		}else{
			inCorrectAnswers += 1;		
		}
		System.out.println();
	}

	System.out.println("the number of correct answers is " + correctAnswers);
	System.out.print("the number of incorrect answers is " + inCorrectAnswers);		


	}


}