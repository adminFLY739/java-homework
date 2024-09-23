public class T07 {
    public static void main(String[] args) {
        double money = 10000;
        double total = 0;
        double rate = 0.05;
        int year = 0;
        for (int i = 0; i < 10; i++) {
            money += money * rate;
            year++;
        }
        System.out.println("第10年：" + money);
        for (int i = 0; i < 4; i++) {
            money += money * rate;
            year++;
            total += money;
        }
        System.out.println("4年总：" + total);
    }
}
