import java.util.*;
public class volume_Of_A_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("Volume of the Cylinder is : "+volume);
    }
    
}
