import java.util.Scanner;

class Cylinder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius and height: ");
            double r = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println("Surface Area = " + (2 * Math.PI * r * (r + h)));
            System.out.println("Volume = " + (Math.PI * r * r * h));
        }
    }
}
