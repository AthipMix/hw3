import java.util.Scanner;

public class Sumaverage {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Num1: ");
       float Num1 = scanner.nextFloat();
       System.out.println("Enter Num2: ");
       float Num2 = scanner.nextFloat();
       System.out.println("Enter Num3: ");
       float Num3 = scanner.nextFloat();
       System.out.println("Enter Num4: ");
       float Num4 = scanner.nextFloat();
       System.out.println("Enter Num5: ");
       float Num5 = scanner.nextFloat();
       double Sum = Num1+Num2+Num3+Num4+Num5;
       double Avg = Sum/5.0;
       System.out.println("Sum of all translators: " + Sum);
       System.out.println("Average of all translators: " + Avg);
       scanner.close();
    } 
}
