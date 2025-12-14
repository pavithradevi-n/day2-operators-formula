import java.util.Scanner;

class Cube {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side: ");
            double a = sc.nextDouble();
            System.out.println("Surface Area = " + (6 * a * a));
            System.out.println("Volume = " + (a * a * a));
            System.out.println("Perimeter = " + (12 * a));
        }
    }
}
