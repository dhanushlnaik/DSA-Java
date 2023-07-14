import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float result;
        System.out.println("Enter The Operator ( +, -, *, / ) ");
        String op = in.nextLine();
        System.out.println("Enter The First Number : ");
        int n1 = in.nextInt();
        System.out.println("Enter The Second Number : ");
        int n2 = in.nextInt();


        switch (op) {
            case "+" -> {
                result = n1 + n2;
                System.out.println( n1 + op + n2 + " = " + result);
            }
            case "-" -> {
                result = n1 - n2;
                System.out.println( n1 + op + n2 + " = " + result);
            }
            case "*" -> {
                result = n1 * n2;
                System.out.println( n1 + op + n2 + " = " + result);
            }
            case "/" -> {
                result = n1 / n2;
                System.out.println( n1 + op + n2 + " = " + result);
            }
            default -> System.out.println("Invalid Operator");
        }



    }
}
