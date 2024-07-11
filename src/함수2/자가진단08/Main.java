package 함수2.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        macro(i1, i2);
    }

    private static void macro(int i1, int i2) {
        int ans = 0;
        int sub = i1 - i2;
        int sum = i1 + i2;

        ans = sub * sub;
        System.out.printf("(%d - %d) ^ 2 = %d\n", i1, i2, ans);
        ans = 0;
        ans = sum * sum * sum;
        System.out.printf("(%d + %d) ^ 3 = %d", i1, i2, ans);
    }
}