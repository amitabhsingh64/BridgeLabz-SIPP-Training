import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areacm = 0.5* base * height;
        double areaInches = 0.5 * base * height * 0.39;
        System.out.println("The area of the triangle in cm square is "+areacm+" and in inches is "+areaInches);
    }
}