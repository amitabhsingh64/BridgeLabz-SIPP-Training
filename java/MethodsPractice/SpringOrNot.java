import java.util.Scanner;
public class SpringOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();;
        int month = sc.nextInt();
        System.out.println("Is it spring? " + SpringOrNot(day, month));
    }    
    public static boolean SpringOrNot(int day, int month) {
        if(month>=3 && month<=6) {
            if(month==3){
                if(day>=20) {
                    return true;
                }
            }else if (month==6) {
                if(day<=20) {
                    return true;
                }
            }
            if(month>3 && month<6) {
                return true;
            }
        }
        return false;
    }
}
