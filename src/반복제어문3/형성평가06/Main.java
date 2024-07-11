package 반복제어문3.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < i1 - i - 1; j++)
                System.out.print("  ");
            for (int j = 0; j <= i; j++)
                System.out.print((j+1) + " ");
            System.out.println();
        }

    }
}
