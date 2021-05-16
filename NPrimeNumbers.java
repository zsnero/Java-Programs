import java.util.Scanner;
public class NPrimeNumbers {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int number, cn=0, count=0;

		System.out.println("Enter the number: ");
		number = scanner.nextInt();

		for(int i = 1; i <= number; i++) {

			cn = i;
			count = 0;

			for(int j = 1; j <= cn; j++) {

				if(cn % j == 0) {
					count++;
				}
			}

			if(count == 2) {
			System.out.println(""+cn);
		}
		}

	}
}