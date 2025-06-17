import java.util.Scanner;
public class SumLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();
        int sum = 0;
        System.out.println("sum:" + sumLoop(n, sum));
    }
    public static int sumLoop(int n, int sum) {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
