import java.util.Scanner;

public class T26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double e = 1;
        long temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            e += 1.0 / temp;
            temp = 1;
        }
        System.out.println(e);
    }
}
