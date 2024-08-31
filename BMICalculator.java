import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilokrams: ");
        short weight = scanner.nextShort();
        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();
        double BMI = weight / (height * height);
        System.out.println("Your BMI for weight = "+weight+"kg and height = "+height+"meters is: "+BMI+" bmi.");
        scanner.close();
    }
}