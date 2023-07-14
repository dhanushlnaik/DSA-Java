import java.util.Scanner;
// Area
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Find Area of:\n1) Circle\n2) Triangle\n3) Rectangle\n4) Square\n5) Parallelogram");
        int r = in.nextInt();
        float area;
        switch (r) {
            case 1 -> {
                System.out.println("Enter Radius : ");
                int rad = in.nextInt();
                area = (float) 3.14 * rad * rad;
                System.out.println("Area : "  + area);
            }
            case 2 -> {
                System.out.println("Enter Base of Triangle : ");
                int base = in.nextInt();
                System.out.println("Enter Height of Triangle : ");
                int height = in.nextInt();
                area = (float) base * height / 2;
                System.out.println("Area : "  + area);
            }
            case 3 -> {
                System.out.println("Enter Length of Rectangle : ");
                int len = in.nextInt();
                System.out.println("Enter Width of Rectangle : ");
                int wid = in.nextInt();
                area = (float) len * wid;
                System.out.println("Area : "  + area);
            }
            case 4 -> {
                System.out.println("Enter Side of Square : ");
                int side = in.nextInt();
                area = (float) side * side;
                System.out.println("Area : "  + area);
            }
            case 5 -> {
                System.out.println("Enter Base of Parallelogram : ");
                int basep = in.nextInt();
                System.out.println("Enter Height of Parallelogram : ");
                int heightp = in.nextInt();
                area = (float) basep * heightp;
                System.out.println("Area : "  + area);
            }
            default -> {
                System.out.println("Invalid Area");
            }
        }
    }
}
