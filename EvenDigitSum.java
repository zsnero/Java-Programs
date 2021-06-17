import  java.util.Scanner;
public class EvenDigitSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if(getEvenDigitSum(number)<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Sum of even number is: " + getEvenDigitSum(number));
        }
    }

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }
        int originalNumber = number;
        int lastDigit = 0;
        int sumOfEvenDigits = 0;

        while(number > 0) {
            lastDigit = number % 10;
            if(lastDigit%2 == 0) {
                sumOfEvenDigits = sumOfEvenDigits + lastDigit;
            }
            number = number/10;
        }
        return sumOfEvenDigits;
    }
}
