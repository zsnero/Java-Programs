import java.util.Scanner;
public class PerfectNumber {
  public static void main(String args[]) {
    int number, sum = 0, i;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    number = scanner.nextInt();
    
    for(i = 1; i < number; i++) {  
      if(number % i == 0) {
        sum = sum + i;
      }
    }
    
    if(sum == number) {
     System.out.println(number + " is a perfect number"); 
    }
    else {
     System.out.println(number + " is not a perfect number"); 
    }
  }
}
