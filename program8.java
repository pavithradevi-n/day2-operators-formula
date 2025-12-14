import java.util.Scanner;

class PerimeterSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side: ");
            double s = sc.nextDouble();
            System.out.println("Perimeter = " + (4 * s));
        }
    }
}
