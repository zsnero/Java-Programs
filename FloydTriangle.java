import java.util.Scanner;
public class FloydTriangle {
	public static void main(String args[]) {
		int rows, a = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		rows = scanner.nextInt();

		for(int i = 1; i <= rows; i++) {

			for(int j = 1; j <= i; j++) {

				System.out.print(a);
				a++;

			}

			System.out.print("\n");
		}
	}
}