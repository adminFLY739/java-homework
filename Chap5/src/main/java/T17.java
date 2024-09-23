import java.util.Scanner;

public class T17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j + 1 >= 10) {
                    System.out.printf(" %d", j + 1);
                } else {
                    System.out.printf("  %d", j + 1);
                }
            }
            for (int j = i; j > 0; j--) {
                if (j >= 10) {
                    System.out.printf(" %d", j);
                } else {
                    System.out.printf("  %d", j);
                }
            }
            System.out.println();
        }
    }
}
