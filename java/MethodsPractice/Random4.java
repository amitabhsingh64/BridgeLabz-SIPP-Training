import java.util.Random;
import java.util.Scanner;
public class Random4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations= sc.nextInt();
        double average=1;
        int[] numbers = new int[iterations];
        generateRandomNumbers(numbers, iterations,average);
    }
    public static void generateRandomNumbers(int[] numbers, int iterations,double average) {
        Random random = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < iterations; i++) {
            numbers[i] = random.nextInt(10000);
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        average = (double) sum / iterations;
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.printf("Average: %.2f%n", average);
        System.out.print("Generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
