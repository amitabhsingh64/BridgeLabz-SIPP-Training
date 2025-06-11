import java.util.*;
public class power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double power = Math.pow(base, exponent);
        System.out.println("Base raised to the exponent, Power is : "+power);
    }
    
}
