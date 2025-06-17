import java.util.Scanner;
class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1- number2;
        float multiplication = number1- number2;
        float divison = number1 / number2;
        System.out.println("The addition, subtraction, multiplication. division value of 2 numbers are "+addition+ " , "+subtraction+ " , "+multiplication+" , "+divison);

    }
    
}