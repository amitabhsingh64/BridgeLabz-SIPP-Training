import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Quotient: " + calculateQuotient(number1, number2));
        System.out.println("Remainder: " + calculateRemainder(number1, number2));
    }
    public static int calculateQuotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return number1 / number2;
    }
    public static int calculateRemainder(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return number1 % number2;
    }

}