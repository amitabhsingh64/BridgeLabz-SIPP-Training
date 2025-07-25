import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        
        if (result == 1) {
            System.out.println(number + " is a positive number");
        } else if (result == -1) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is zero");
        }
    }
    
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}