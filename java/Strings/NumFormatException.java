import java.util.Scanner;

public class NumFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        smth(str);
    }
    public static void smth(String str){
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
