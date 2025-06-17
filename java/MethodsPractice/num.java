import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(aboutNum(number));
    }
    public static String aboutNum(int number) {
        if (number < 0) {
            return "The number is negative.";
        } else if (number == 0) {
            return "The number is zero.";
        }else if(number >0){
            return "The number is positive.";
        }
        return "Invalid input.";
    }
}
