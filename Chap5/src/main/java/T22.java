import java.util.Scanner;

public class T22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = input.nextDouble();
        double irate = interestRate / 1200;
        System.out.println();
        double monthly = loanAmount * irate / (1 - 1 / Math.pow(1 + irate, years * 12));
        double total = monthly * 12 * years;
        System.out.printf("Monthly payment: %.2f", monthly);
        System.out.println();
        System.out.printf("Total payment: %.2f", total);
        System.out.println();
        System.out.println();
        System.out.println("Payment#     Interest    Principal     Balance");
        double interest;
        double princial;
        double balance = loanAmount;
        for (int i = 1; i <= years * 12; i++) {
            interest = irate * balance;
            princial = monthly - interest;
            balance = balance - princial;
            System.out.printf("%-13d", i);
            System.out.printf("%-12.2f", interest);
            System.out.printf("%-14.2f", princial);
            System.out.printf("%.2f", balance);
            System.out.println();
        }
    }
}

