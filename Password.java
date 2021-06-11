import java.util.*;
public class Password {
    public static void main(String args[]) {
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        password = scanner.nextLine();
        if(password.isEmpty()) {
            System.out.println("Null");
        }
        else {
            boolean isValid = isValidPassword(password);

            if (isValid) {
                System.out.println("Password is valid: " + password);
            } else {
                System.out.println("The Password is invalid!!!!! ");
            }
        }

    }
    public static boolean isValidPassword(String password) {

        boolean isValid = true;

        if(password.length()<8 || password.length()>10) {
            System.out.println("Password length should be greater than 8 and less than 10");
            isValid = false;
        }

        String upperCase = "(.*[A-Z].*)";
        if(!password.matches(upperCase)) {
            System.out.println("Password should contain Upper Case letters");
            isValid = false;
        }

        String lowerCase = "(.*[a-z].*)";
        if(!password.matches(lowerCase)) {
            System.out.println("Password should contain Lower Case Letters");
        }
        
        String number = "(.*[0-9].*)";
        if(!password.matches(number)) {
            System.out.println("Password should contain numbers");
            isValid = false;
        }

        String symbols = "(.*[@#$%].*$)";
        if(password.matches(symbols)) {
            System.out.println("Password should not contain symbols");
            isValid = false;
        }
        return isValid;
    }
}
