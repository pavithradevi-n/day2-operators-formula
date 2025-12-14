import java.util.Scanner;
class program2 {//Area
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side: ");
            double s = sc.nextDouble();
            System.out.println("Area = " + (s * s));
        }
    }
}
