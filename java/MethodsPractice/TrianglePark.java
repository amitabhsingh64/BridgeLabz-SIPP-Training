import java.util.Scanner;
public class TrianglePark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println(rounds(side1, side2, side3));
    }
    public static Double rounds(int side1, int side2, int side3){
        double totalPerimeter=side1 + side2 + side3;
        return totalPerimeter /5;
    }
}
