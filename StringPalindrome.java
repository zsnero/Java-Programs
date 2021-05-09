import java.util.Scanner;
public class StringPalindrome {
	public static void main(String args[]) {

		String string, reverse="", temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		string = scanner.nextLine();
		temp = string;

		for(int i = string.length()-1; i >= 0; i--) {

			reverse = reverse + string.charAt(i);
		}

		System.out.println("Reversed String is: "+reverse);

		if(reverse.equals(temp)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}