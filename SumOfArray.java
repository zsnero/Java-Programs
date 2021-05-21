import java.util.*;
public class SumOfArray {
	public static void main(String args[]) {

		int count, sum = 0;
		int arr[];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the count: ");
		count = scanner.nextInt();
		arr = new int[count];

		System.out.println("Enter the numbers: ");

		for(int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}

		System.out.println("Numbers inside array is: ");

		for(int numbers : arr) {
			System.out.println(numbers);
		}

		System.out.println("Sum of numbes inside array is: ");

		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);
	}
}