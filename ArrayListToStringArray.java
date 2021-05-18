import java.util.*;
public class ArrayListToStringArray {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();

		System.out.println("Enter 5 names: ");

		for(int i = 0; i < 5; i++) {

			names.add(scanner.nextLine());
		}

		System.out.println("Entered names are: ");


		String arr[] = new String[names.size()];

		for( int i = 0; i < names.size(); i++) {

			arr[i] = names.get(i);
		}

		int a = 1;

		for(String i : arr) {

			System.out.println("name "+a+": "+i);
			a++;
		}
	}

}