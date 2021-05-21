import java.util.*;
public class SumOfArrayList {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0, remainder;

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Enter the count: ");

		int count = scanner.nextInt();

		System.out.println("Enter the numbers: ");

		for(int i = 0; i < count; i++) {

			numbers.add(scanner.nextInt());
		}
		
		System.out.println("Numbers inside list: ");

		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("Sum of all numbers inside ArrayList: ");

		for(int i = 0; i < numbers.size(); i++) {

			sum = sum + numbers.get(i);
		}

		System.out.println(sum);
	}
}