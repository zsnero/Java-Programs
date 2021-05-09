import java.util.Scanner;
public class SwapNumbers {
	public static void main(String args[]) {

		int firstNumber, secondNumber, temp;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = scanner.nextInt();

		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println("First Number is: "+firstNumber);
		System.out.println("Second Number is: "+secondNumber);
	}
}