import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        int a = 0;
        int b = 1;
        System.out.println("Enter the nth value: ");
        n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        while(sum <= n)
        {
            System.out.print(sum + " ");
            a = b;  // swap elements
            b = sum;
            sum = a + b;  // next term is the sum of the last two terms
        }
    }
}
