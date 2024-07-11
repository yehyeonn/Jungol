package 함수2.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("radius : ");
        double d1 = sc.nextDouble();

        getArea(d1);
    }

    private static void getArea(double d1) {
        final double pi = 3.141592;
        double ans = d1 * d1 * pi;
        System.out.printf("area = %.3f", ans);
    }


}