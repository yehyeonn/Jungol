package 함수2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.printf("%d\n%.2f", method1(i1, i2), method2(d1, d2));

    }

    public static int method1(int i1, int i2) {
        int a, b = 0;
        a = (i1 > 0) ? i1 : i1 * -1;
        b = (i2 > 0) ? i2 : i2 * -1;

        int max = 0;

        max = (a > b) ? i1 : i2;
        return max;
    }

    public static double method2(double d1, double d2) {
        double a, b = 0;
        a = (d1 > 0) ? d1 : d1 * (-1);
        b = (d2 > 0) ? d2 : d2 * (-1);

        double min = 0;

        min = (a > b) ? d2 : d1;
        return min;
    }


}