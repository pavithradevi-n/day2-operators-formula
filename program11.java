import java.util.Scanner;

class CircumferenceCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Circumference = " + (2 * Math.PI * r));
        }
    }
}
