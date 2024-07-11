package 입력.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("yard? ");

        double d1 = sc.nextDouble();
        double d2 = d1 * 91.44;

        System.out.printf("%.1fyard = %.1fcm", d1, d2);
    }
}
