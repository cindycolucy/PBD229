import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int feet;
        int inches;
        int pounds;

        System.out.println("How tall are you (feet only)?");
        feet = scanner.nextInt();

        System.out.println("How many inches?");
        inches = scanner.nextInt();

        int totalInches = feet * 12 + inches;

        System.out.println("How much do you weigh (pounds)?");
        pounds = scanner.nextInt();

        double weight = pounds * .453592;
        double height = totalInches * .0254;

        double bmi = weight/(height * height);

        System.out.println("Your BMI is " + bmi);

        if(bmi < 18.5) System.out.println("You are underweight.");
        else if(bmi >= 18.5 && bmi <= 24.9) System.out.println("You are normal weight.");
        else if(bmi >= 25.0 && bmi <= 29.9) System.out.println("You are overweight.");
        else System.out.println("You are obese.");
    }
}
