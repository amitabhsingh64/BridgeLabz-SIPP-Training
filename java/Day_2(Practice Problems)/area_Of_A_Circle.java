import java.util.*;
public class area_Of_A_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double Area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of the circle is : "+Area);
    }
    
}
