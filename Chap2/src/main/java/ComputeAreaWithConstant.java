import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius;
        double area;
        System.out.print("Enter a number for radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
