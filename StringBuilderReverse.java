import java.util.Scanner;
public class StringBuilderReverse {
	public static void main(String args[]) {
		String string;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string to reverse: ");
		string = scanner.nextLine();

		StringBuilder str = new StringBuilder(string);

		System.out.println(str.reverse());
	}
}