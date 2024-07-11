package 입력.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int i1 = a * b;
        int i2 = a / b;

        System.out.printf("%d * %d = %d", a, b, i1);
        System.out.printf("\n%d / %d = %d", a, b, i2);

    }
}
