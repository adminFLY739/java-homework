public class T27 {
    public static void main(String[] args) {
        int[] leapYears = new int[2000];
        int cnt = 0;
        for (int year = 101; year <= 2100; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                leapYears[cnt] = year;
                cnt++;
            }
        }
        for (int i = 0; i < leapYears.length; i++) {
            if (leapYears[i] == 0) {
                break;
            }
            System.out.print(leapYears[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
