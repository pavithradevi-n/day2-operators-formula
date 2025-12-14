import java.util.Scanner;

class Cuboid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length breadth height: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println("Surface Area = " + (2 * (l*b + b*h + l*h)));
            System.out.println("Volume = " + (l * b * h));
        }
    }
}
