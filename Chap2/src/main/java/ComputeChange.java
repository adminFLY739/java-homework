import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainAccount = (int) amount * 100;
        int numberOfOneDollars = remainAccount / 100;
        remainAccount = remainAccount % 100;
        int numberOfQuarters = remainAccount / 25;
        remainAccount = remainAccount % 25;
        int numberOfDimes = remainAccount / 10;
        remainAccount = remainAccount % 10;
        int numberOfNickels = remainAccount / 5;
        remainAccount = remainAccount % 5;
        int numberOfPennies = remainAccount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
