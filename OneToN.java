import java.util.Scanner;
public class OneToN {
    static int i = 1;

    public static void main(String args[]) {
        int count = 0;
        System.out.println("Enter the count: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        ton(count);
    }

    public static int ton(int count) {
        if(i <= count) {
            System.out.println(i);
            i++;
        }
        else {
            return 0;
        }
        return ton(count);
    }

}
