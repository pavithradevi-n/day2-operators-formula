import java.util.Scanner;

class Sphere {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Surface Area = " + (4 * Math.PI * r * r));
            System.out.println("Volume = " + ((4.0/3) * Math.PI * r * r * r));
        }
    }
}
