import java.util.Scanner;
public class StringBufferReverse {
	public static void main(String args[]) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		string = scanner.nextLine();

		StringBuffer str = new StringBuffer(string);
		System.out.println(str.reverse());
	}
}