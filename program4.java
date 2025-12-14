import java.util.Scanner;

class AreaCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Area = " + (Math.PI * r * r));
        }
    }
}
