package 입력.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        String s1 = sc.next();

        System.out.printf("%.2f\n%.2f\n%s", d1, d2, s1);
    }
}
