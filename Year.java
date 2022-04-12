import java.util.Scanner;

public class Year {

	/*   
		main(),judge Leap Year
	*/
	public static void main(String[] args) {
		//input new year;
		Scanner input = new Scanner(System.in);
		System.out.println("input the new year:");
		int year = input.nextInt();

		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("this year " + year + "is leap year.");
		}
		else{
			System.out.println("this year " + year + " is\'t leap year.");
		}
	}
}