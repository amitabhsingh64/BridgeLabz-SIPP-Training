import java.util.*;
public class celsius_To_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("After converting Celsius to Fahrenheit : "+fahrenheit);
    }
    
}