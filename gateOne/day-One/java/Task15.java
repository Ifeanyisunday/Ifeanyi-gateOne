public class Task15{
	public static void main(String... args){

	int range = 10;
	String multiple = "";
	int numberOfTimes = 5;
	for(int counter = 0; counter <= range; counter+=4){
		
		if(counter % 2 == 0){
			multiple = (String)counter;
			System.out.println(multiple * numberOfTimes);
		}
	}
	}
}