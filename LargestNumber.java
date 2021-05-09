import java.util.Scanner;
public class LargestNumber {
	public static void main(String args[]) {

		int number, max, i;
		int arr[];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		number = scanner.nextInt();

		arr = new int[number];

		System.out.println("Enter the numbers into Array: ");

		for(i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}

		max = max_number(arr, number);

		System.out.println("Maximum number is: "+max);
	}

	public static int max_number(int arr[], int number) {

		int max = 0, i;

		for(i = 0; i < number; i++) {

			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}