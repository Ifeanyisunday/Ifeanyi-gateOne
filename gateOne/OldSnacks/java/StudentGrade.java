import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many students do you have?");
	int students = input.nextInt();

	System.out.println("How many subjects do they offer?");
	int subjects = input.nextInt();
	
	int count = 1;
	int index = 1;
	int[][] gradeCollector = new int[students][subjects];
	int[] studentTotal = new int[students];
	double[] average = new double[students];
	double studentAverageTotal = 0; 
	for(int i = 0; i < students; i++){
		for(int j = 0; j < subjects; j++){
				System.out.println("Entering score for student "+ count);
				System.out.println("Enter score for subject " + index);
				int scoreCollector = input.nextInt();
				gradeCollector[i][j] = scoreCollector;
				studentTotal[i] += scoreCollector;
				index++;
		}
		average[i] = studentTotal[i] / (double)subjects;
		studentAverageTotal += average[i]; 
		count++;
		index = 1;
	}
	
	double getstudentAverageTotal = studentAverageTotal / students;

	int[] defaultPos = new int[students];
	for(int i = 0; i < students; i++){
		defaultPos[i] = 1;
	}

	int[] sortPos = defaultPos;

	for(int posIndex = 0; posIndex < students; posIndex++){
		for(int posCount = 0; posCount < students; posCount++){
			if(posCount > posIndex){
				sortPos[posCount] += 1;	
			}
		}
				
	}


System.out.println("===============================================================================");
System.out.printf("%s", "STUDENT\t"); 
int counter = 1;
int largest = 0;
	for(int i = 0; i < subjects; i++){
		System.out.printf("%" + 5 + "s%-" + 2 + "d", "SUB", counter);
		counter++;
	}
System.out.printf("%" + 7 + "s%" + 6 + "s%" + 6 + "s%n", "TOTAL", "AVE", "POS");

int increase = 1; 
	for(int i = 0; i < students; i++){
		String formattedString1 = String.format("%s%d", "student",increase);
		System.out.print(formattedString1);
		for(int j = 0; j < subjects; j++){
			System.out.printf("   %-" + 4 + "d",gradeCollector[i][j]);
		}
		System.out.printf(" %" + 4 + "d    %" + 4 + ".2f",studentTotal[i],average[i]);
		System.out.printf(" %" + 4 + "d%n",sortPos[i]);
		increase++;

	}
	
	
System.out.println("===============================================================================");
System.out.println("===============================================================================\n");

		int highest = 0;
		int subSum = 0;
		int[] highOfFirstSub = new int[students];
		int[] subSumTotal = new int[students];
		int [] highStudentArr = new int[students];
		int highStudent = 0;
		double[] averegeSubScore = new double[students];
		int pass = 0;
		int fail = 0;
		int[] arrOfPass = new int[students];
		int[] arrOfFail = new int[students];
		int index1 = 1;

		for(int i = 0; i < gradeCollector.length; i++){
			for(int j = 0; j < gradeCollector.length; j++){
				if(gradeCollector[j][i] > highest){
					highest = gradeCollector[j][i];
					highStudent = index1; 
				}
				
				if(gradeCollector[j][i] >= 50){
					pass++;
				}else{
					fail++;
				}
				index1++;
				subSum += gradeCollector[j][i];
			}

			arrOfPass[i] = pass;
			arrOfFail[i] = fail;
			highStudentArr[i] = highStudent;
			subSumTotal[i] = subSum;
			averegeSubScore[i] = subSumTotal[i] / (double)students;
			highOfFirstSub[i] = highest;
			highest = 0;
			subSum = 0;
			index1 = 1;
			pass = 0;
			fail = 0;
		}


		int lowest = 0;
		int[] lowOfFirstSub = new int[students];
		int lowStudent = 0;
		int[] lowStudentArr = new int[students];
		int index2 = 1;
		for(int i = 0; i < students; i++){
			lowest = highOfFirstSub[i];
			for(int j = 0; j < students; j++){ 
				if(gradeCollector[j][i] < lowest){
					lowest = gradeCollector[j][i];
					lowStudent = index2;	
				}
				index2++;
			}
			lowStudentArr[i] = lowStudent;
			lowOfFirstSub[i] = lowest;
			index2 = 1;
		}

System.out.println("===============================================================================");
	System.out.println("SUBJECT SUMMARY");
	int subCount = 1;
	int highest1 = 0;
	int low = 0;
	for(int i = 0; i < students; i++){
		System.out.println("subject" + subCount);
		System.out.println("Highest scoring student is: Student " + highStudentArr[i] + " scoring " + highOfFirstSub[i]);	
		System.out.println("Lowest scoring student is: Student " + lowStudentArr[i] + " scoring " + lowOfFirstSub[i]);

		System.out.println("Total score is: " + subSumTotal[i]);
		System.out.printf("%s%.2f%n", "Average score is: ", averegeSubScore[i]);
		System.out.println("Number of Passes: " + arrOfPass[i]);
		System.out.println("Number of Fails: " + arrOfFail[i]);
		System.out.println("");
		subCount++;
	}
System.out.println("===============================================================================");
	
	int index3 = 1;
	int hardestSub = 0;
	int hardestSubCount = 0;
	for(int i = 0; i < arrOfFail.length; i++){
		if(arrOfFail[i] > hardestSub){
			hardestSub = arrOfFail[i];
			hardestSubCount = index3;
		}
		index3++;
	}
	

	index3 = 1;
	int easiestSub = 0;
	int easiestSubCount = 0;
	for(int i = 0; i < arrOfFail.length; i++){
		if(arrOfPass[i] > easiestSub){
			easiestSub = arrOfPass[i];
			easiestSubCount = index3;
		}
		index3++;
	}


	index3 = 1;
	int index4 = 1;
	int overAllHighest = 0;
	int overAllHighestCount = 0;
	int overAllHighestSubCount = 0;
	for(int i = 0; i < gradeCollector.length; i++){
			for(int j = 0; j < gradeCollector.length; j++){
				if(gradeCollector[j][i] > overAllHighest){
					overAllHighest = gradeCollector[j][i];
					overAllHighestCount = index3;
					overAllHighestSubCount =  index4;
				}
				index3++;
			}
		index3 = 1;
		index4++;
	}

	index3 = 1;
	index4 = 1;
	int overAllLowest = overAllHighest;
	int overAllLowestCount = 0;
	int overAllLowestSubCount = 0;
	for(int i = 0; i < gradeCollector.length; i++){
			for(int j = 0; j < gradeCollector.length; j++){
				if(gradeCollector[j][i] < overAllLowest){
					overAllLowest = gradeCollector[j][i];
					overAllLowestCount = index3;
					overAllLowestSubCount = index4; 
				}
				index3++;	
			}
		index3 = 1;
		index4++;
	}

System.out.println("===============================================================================");
System.out.println("");
System.out.println("The hardest subject is Subject " + hardestSubCount + " with " +  hardestSub + " failures");
System.out.println("The easiest subject is Subject " + easiestSubCount + " with " +  easiestSub + " passes");
System.out.println("The overall Highest score is scored by Student " + overAllHighestCount + " in subject " + overAllHighestSubCount + " scoring " + overAllHighest);
System.out.println("The overall Lowest score is scored by Student " + overAllLowestCount + " in subject " + overAllLowestSubCount + " scoring " + overAllLowest);
System.out.println("");
System.out.println("===============================================================================");

	int highestRange = 0;
	int index5 = 1;
	int bestStudent = 0;
	for(int i = 0; i < students; i++){
		if(studentTotal[i] > highestRange){
			highestRange = studentTotal[i];
			bestStudent = index5;
		}
		index5++;
	}

	int lowestRange = highestRange;
	index5 = 1;
	int worstStudent = 0;
	for(int i = 0; i < students; i++){
		if(studentTotal[i] < lowestRange){
			lowestRange = studentTotal[i];
			worstStudent = index5;
		}
		index5++;
	}

	
	int classTotal = 0;
	for(int i = 0; i < students; i++){
		 classTotal += studentTotal[i];
	}

	double averageOfClassTotal = classTotal / (double)students;

System.out.println("");	
System.out.println("CLASS SUMMARY");
System.out.println("===============================================================================");
System.out.println("Best Graduating Student is: Student " + bestStudent + " scoring " + highestRange);
System.out.println("===============================================================================");
System.out.println("");
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("Worst Graduating Student is: Student " + worstStudent + " scoring " + lowestRange);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("");
System.out.println("===============================================================================");
System.out.println("Class total score is: " + classTotal);
System.out.printf("%s%.1f", "Class Average score is: ", averageOfClassTotal);

}


}