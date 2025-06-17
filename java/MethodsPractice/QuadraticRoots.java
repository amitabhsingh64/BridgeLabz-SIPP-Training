import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        findRoots(a, b, c);
    }
    public static void findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Coefficient 'a' can not be zero for a quadratic equation.");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("real and different", root1, root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.printf("real and same", root);
        } else {
            System.out.println("complex");
        }
    }
}
