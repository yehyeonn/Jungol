package 함수2.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        calc(i1);

    }

    public static void calc(int i1) {
        double area = i1/3.14;
        double ans = Math.sqrt(area);

        System.out.printf("%.2f", ans);
    }

}