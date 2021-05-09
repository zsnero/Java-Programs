import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {

		int firstNumber = 0, secondNumber = 1, thirdNumber, i, count;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the count: ");
		count = scanner.nextInt();

		System.out.print(firstNumber +" "+ secondNumber);

		for(i = 2; i <= count; i++) {

			thirdNumber = firstNumber + secondNumber;

			System.out.print(" "+thirdNumber+" ");

			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}
}