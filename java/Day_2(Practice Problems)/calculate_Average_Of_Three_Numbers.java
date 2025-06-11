import java.util.*;
public class calculate_Average_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        double Average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average of three numbers is: " + Average);
    }
    
}
