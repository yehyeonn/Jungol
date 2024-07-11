package 함수1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print(method1(n1, n2) + " " + method2(n1, n2));


    }

    public static int method1(int a, int b) {
        a = (a > b) ? a / 2 : a * 2;
        return a;
    }

    public static int method2(int a, int b) {
        b = (b > a) ? b / 2 : b * 2;
        return b;
    }
}
