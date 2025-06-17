import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        int windSpeed   = sc.nextInt();
        double windChill   = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill is: " + windChill);
    }
    public static double calculateWindChill(int temperature, int windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature -35.75)* Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
