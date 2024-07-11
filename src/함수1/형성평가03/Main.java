package 함수1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        square(i1);
    }

    public static void square(int i1) {
        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i1; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}