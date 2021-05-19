import java.util.*;
public class Calculator {

	public static int multiply(int a, int b) {

		return a*b;
	}

	public static int addition(int a, int b) {
		return a+b;
	}

	public static int subtraction(int a, int b) {
		return a-b;
	}

	public static float division(float a, float b) {
		return a/b;
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("This is a calculator, choose your desired option: ");

		System.out.println(" 1 for Addition ");
		System.out.println(" 2 for Subtraction ");
		System.out.println(" 3 for Multiplication ");
		System.out.println(" 4 for Division ");

		int choice = scanner.nextInt();

		if(choice == 1) {
			System.out.println("Enter two numbers to add: ");
			int numberone = scanner.nextInt();
			int numbertwo = scanner.nextInt();

			System.out.println(numberone +" + "+ numbertwo+" is: "+addition(numberone, numbertwo));
		}

		else if(choice == 2) {
			System.out.println("Enter two numbers to subtract: ");
			int numberone = scanner.nextInt();
			int numbertwo = scanner.nextInt();

			System.out.println(numberone +" - "+ numbertwo+" is: "+subtraction(numberone, numbertwo));
		}

		else if(choice == 3) {
			System.out.println("Enter two numbers to multiply: ");
			int numberone = scanner.nextInt();
			int numbertwo = scanner.nextInt();

			System.out.println(numberone +" * "+ numbertwo+" is: "+multiply(numberone, numbertwo));
		}

		else if(choice == 4) {
			System.out.println("Enter two numbers to divide: ");
			float numberone = scanner.nextInt();
			float numbertwo = scanner.nextInt();

			System.out.println(numberone +" / "+ numbertwo+" is: "+division(numberone, numbertwo));
		}

		else {
			System.out.println("Invalid input");
		}



	}
}