import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter radius: ");
       float radius = scanner.nextFloat();
       double circleArea = 3.14159 * radius * radius;
       System.out.println("Area of circle that has radius " + radius + " meters is " + circleArea + " square meters.");
       scanner.close();
    }
}