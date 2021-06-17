import java.util.Scanner;
public class SharedDigit {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(hasSharedDigit(firstNumber, secondNumber));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if((firstNumber>=10 && firstNumber<=99) && (secondNumber>=10 && secondNumber<=99)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int firstNumberFirstDigit = firstNumber / 10;
            int secondNumberFirstDigit = secondNumber / 10;

            return((firstNumberFirstDigit==secondNumberFirstDigit) || (firstNumberFirstDigit==secondNumberLastDigit) || (firstNumberLastDigit==secondNumberFirstDigit) || (firstNumberLastDigit==secondNumberLastDigit));
        }
        return false;
    }
}
