import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Principal Amount : ");
        int p = in.nextInt();
        System.out.println("Enter The Rate of Interest : ");
        int r = in.nextInt();
        System.out.println("Enter The Time : ");
        int t = in.nextInt();

        float simple_interest = (p*r*t)/100;

        System.out.println(simple_interest);
    }
}
