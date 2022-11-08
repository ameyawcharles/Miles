import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milesDriven;
        double gallons;
        double mpg;


        System.out.println("Enter number of miles driven");
        milesDriven = input.nextDouble();

        System.out.println("Enter the number of gallons used");
        gallons = input.nextDouble();

        mpg = milesDriven / gallons;

        System.out.println("milesDriven = " + milesDriven);
        System.out.println("gallons = " + gallons);
        System.out.println("mpg = " + mpg);
    }
}