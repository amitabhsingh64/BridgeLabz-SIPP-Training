import java.util.Scanner;
public class SunRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println(SumFormula(n)==sumRecur(n, sum));
    }
    public static int sumRecur(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n;
        return sumRecur(n - 1, sum);
    }
    public static int SumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
