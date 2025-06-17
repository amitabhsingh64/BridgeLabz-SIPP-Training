import java.util.Scanner;
public class TrigonometricValues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        System.out.println("Trigonometric values for " + angle + "are:" + values(angle));
    }
    public static String values(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        
        return String.format("sin: %.2f, cos: %.2f, tan: %.2f", sinValue, cosValue, tanValue);
    }
}