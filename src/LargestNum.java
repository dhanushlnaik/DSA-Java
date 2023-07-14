import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int n1 = in.nextInt();
        System.out.println("Enter The Second Number : ");
        int n2 = in.nextInt();

        if (n1>n2) {
            System.out.println(n1 + " is the Largest Number.");
        } else {
            System.out.println(n2 + " is the Largest Number.");
        }
    }
}
