import java.util.*;
public class calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int principal = sc.nextInt();
        double time = sc.nextDouble();
        double rate = sc.nextDouble();
        double simpleInterest = (principal*rate*time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
    
}
