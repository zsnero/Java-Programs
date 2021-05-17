import java.util.Scanner;
public class SwapWithoutTemp {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int firstNumber, secondNumber;

		System.out.println("Enter First Number: ");
		firstNumber = scanner.nextInt();

		System.out.println("Enter Second Number: ");
		secondNumber = scanner.nextInt();

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("First Number: "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
	}
}