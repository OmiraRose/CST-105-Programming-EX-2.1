import java.util.*;
/** cst-105 java Project 2.1
 * Prompts the user to  input a 5 digit number and produces the sum of the numbers entered.
 * @author Omira
 *
 */
public class SumPositiveDigits {

	public static void main(String[]args) {
		//Create new Scanner Object
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a five digit number
		
		System.out.print("Enter a five digit number");
		
		// Store input into integer variable
		
		int number = input.nextInt();
		
		//Store each digit of the number in a variable
		
		int number1 = number % 100000/10000;
		int number2 = number % 10000/1000;
		int number3 = number % 1000/100;
		int number4 = number % 100/10;
		int number5 = number % 10;
		
		//Add the numbers together
		
		int sum = number1 + number2 + number3 + number4 + number5;
		
		//Display the sum
		
		System.out.println("The sum of "+number1+ ", "+ number2+", "+number3+", "+number4+ ", and "+number5+" is "
				+sum);
	}
}
