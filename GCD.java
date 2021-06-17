import java.util.Scanner;
public class GCD {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(getGreatestCommonDivisor(firstNumber,secondNumber));
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if(firstNumber>=10 && secondNumber>=10) {
            int smallerNumber = Math.min(firstNumber, secondNumber);
            for(int gcd = smallerNumber; gcd > 0; gcd--) {
                if((firstNumber%gcd==0) && (secondNumber%gcd==0)) {
                    return gcd;
                }
            }
        }
        return -1;
    }
}
