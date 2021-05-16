import java.util.Scanner;
public class Average {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		float sum = 0;
		int numbers[];

		System.out.println("Enter the count: ");
		int count = scanner.nextInt();
		numbers = new int[count];

		System.out.println("Enter the numbers: ");
		for(int i = 0; i < numbers.length; i++) {

			numbers[i] = scanner.nextInt();
		}

		int i = 0;

		while(i < numbers.length) {

			sum = sum + numbers[i];
			i++;
		}

		//or

		/*for( ; i < numbers.length; i++) {

			sum = sum + numbers[i];
		}*/

		float average = sum / numbers.length;
		System.out.println(average);


	}
}