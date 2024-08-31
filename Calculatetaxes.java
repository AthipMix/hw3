import java.util.Scanner;

public class Calculatetaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        float salary = scanner.nextFloat();
        System.out.println("Enter taxrate: ");
        float taxRate = scanner.nextFloat();
        double tax = salary-taxRate/100*salary;
        System.out.println(tax);
        scanner.close();
    }
}