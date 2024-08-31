import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        short base = scanner.nextShort();
        System.out.print("Enter the height of the triangle: ");
        short height = scanner.nextShort();
        double Area = (1.0/2) * base * height;
        System.out.println("Area of the triangle: "+Area+" square units");

        System.out.println("-----------------------------------------------");

        System.out.print("Enter the length of the square: ");
        double length = scanner.nextDouble();
        double square = length * length;
        System.out.println("Area of the squareArea: "+square+" square units");

        scanner.close();
    }
}