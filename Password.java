import java.util.Scanner;

class Passsword {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Password");

        String password = scanner.nextLine();

        boolean validPassword = isValidPassword(password);
        System.out.println(password+" is valid password:" +validPassword);

    }

    public static boolean isValidPassword(String password)
    {
        boolean isValid = true;
        if (password.length() > 10 || password.length() < 8)
        {
            System.out.println("Password must be less than 10 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (password.matches(specialChars ))
        {
            //System.out.println("Password must have at least one special character among @#$%");
            System.out.println("Password cannot have special characters among @#$%");
            isValid = false;
        }
        return isValid;
    }
}
