public class T19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j - 1));
            }
            System.out.println();
        }
    }
}
