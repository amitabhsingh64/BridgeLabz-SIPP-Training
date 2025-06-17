import java.util.Scanner;
public class ChocolatePerChild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        findReminderQuotient(chocolates, children);
    }
    public static void findReminderQuotient(int chocolates, int children) {
        if (children == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        System.out.println("Each child gets " + quotient + " chocolates and " + remainder + " chocolates are left over.");
    }
}
