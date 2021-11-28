import java.util.Scanner;
public class LargestNumberAlt {
    public static void main(String args[]) {

        int arr[];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the count: ");
        count = scanner.nextInt();
        arr = new int[count];

        System.out.println("Enter the numbers: ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int big = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i]>big) {
                big = arr[i];
            }
        }
