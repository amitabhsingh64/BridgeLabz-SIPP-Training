import java.util.Scanner;
public class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        System.out.println("Enter the ages of three friends:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        int[] heights = new int[3];
        System.out.println("Enter the heights of three friends:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        youngestFriend(ages);
        tallestFriend(heights);
    }
    public static void youngestFriend(int[] ages) {
        int minAge = ages[0];
        for (int age : ages) {
            if (age < minAge) {
                minAge = age;
            }
        }
        System.out.println("The youngest friend is " + minAge + " years old.");
    }
    public static void tallestFriend(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        System.out.println("The tallest friend is " + maxHeight + "Units tall.");
    }
    
}
