import java.util.Scanner;

// Input currency in rupees and output in USD.
public class USDConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Currency in Rupees : ");
        int rup = in.nextInt();
        float usd = (float) (rup*82.04445);

        System.out.println(rup + " INR" + " = " + usd + " USD");
    }
}
