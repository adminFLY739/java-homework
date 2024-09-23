import java.util.Scanner;

public class T25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 0;
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        System.out.println(pi * 4);
    }
}
