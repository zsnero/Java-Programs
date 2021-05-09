import java.util.Scanner;
public class SumWithoutPlus {
	public static void main(String args[]) {
		int firstNumber, secondNumber, sum;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the First Number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number: ");
		secondNumber = scanner.nextInt();

		sum = firstNumber - (-secondNumber);
		System.out.println("Sum of fist and second number is: "+sum);
	}
}