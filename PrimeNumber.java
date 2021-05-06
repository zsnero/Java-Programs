import java.util.Scanner;

public class PrimeNumber {
  public static void main(String args[]) {
    int number, count = 0, i;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    number = scanner.nextInt();
    
    for( i = 1; i <= number; i++) {    
      if(number % i == 0) {
        count++;
      }
    }
    
    if(count == number) {
     System.out.println(number +" is a Prime Number"); 
    }
    else {
      System.out.println(number +" is not a Prime Number");
    }
    
  }
}
