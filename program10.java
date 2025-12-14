import java.util.Scanner;

class PerimeterTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three sides: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.println("Perimeter = " + (a + b + c));
        }
    }
}
