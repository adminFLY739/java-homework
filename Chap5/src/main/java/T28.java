import java.util.Scanner;

public class T28 {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int weekday = scanner.nextInt();
        printFirstDayOfMonth(year, weekday);
    }

    private static void printFirstDayOfMonth(int year, int weekday) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            int k = 0;
            for (int j = 0; j < i; j++) {
                k += daysInMonth[j];
            }
            k = (k + weekday) % 7;
            System.out.println(months[i] + " 1, " + year + " is " + weekdays[k]);
        }
    }
}
