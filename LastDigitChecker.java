import java.util.Scanner;
public class LastDigitChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        System.out.println(hasSameLastDigit(firstNumber,secondNumber,thirdNumber));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if((firstNumber>=10&&firstNumber<=1000)&&(secondNumber>=10&&secondNumber<=1000)&&(thirdNumber>=10&&thirdNumber<=1000)) {

            int firstNumberLastDigit = firstNumber%10;
            int secondNumberLastDigit = secondNumber%10;
            int thirdNumberLastDigit = thirdNumber%10;

            return ((firstNumberLastDigit==secondNumberLastDigit)||(firstNumberLastDigit==thirdNumberLastDigit)||(secondNumberLastDigit==thirdNumberLastDigit));
        }
        return false;
    }
}
