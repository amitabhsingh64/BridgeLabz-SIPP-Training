import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        System.out.println("Total handshakes: " + calculateHandshakes(numberOfPeople));
    }
    public static int calculateHandshakes(int numberOfPeople) {
        if (numberOfPeople < 0) {
            System.out.println("Number of people cannot be negative.");
            return 0;
        }
        // Using the formula n(n-1)/2 
        return (numberOfPeople * (numberOfPeople - 1)) / 2;
    }
}
