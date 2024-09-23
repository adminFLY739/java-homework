import java.util.Scanner;

public class T36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiacSigns = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int index = year % 12;
        System.out.println(zodiacSigns[index]);
    }
}

