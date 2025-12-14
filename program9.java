import java.util.Scanner;

class PerimeterRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length and breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Perimeter = " + (2 * (l + b)));
        }
    }
}
