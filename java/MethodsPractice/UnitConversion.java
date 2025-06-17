import java.util.Scanner;
public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        if (length < 0) {
            System.out.println("Length cannot be negative.");
        }
        yard2feet(length);
        feet2yard(length);
        meter2inches(length);
        inches2meter(length);
        inches2cm(length);
    }
    public static void yard2feet(int length) {
        Double feet = length * 3.0;
        System.out.println("yard2feet: " + feet);
    }
    public static void feet2yard(int length) {
        Double yard = length / 3.0;
        System.out.println("feet2yard: "+ yard);
    }
    public static void meter2inches(int length) {
        Double inches = length * 39.37;
        System.out.println("meter to inches: " + inches);
    }
    public static void inches2meter(int length) {
        Double meter = length / 39.37;
        System.out.println("inches2meter: " + meter);
    }
    public static void inches2cm(int length) {
        Double cm = length * 2.54;
        System.out.println("inches2cm: " + cm);
    }
}
