package 반복제어문3.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        char c = 'A';
        int i2 = 0;

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < i1 - i; j++) {
                System.out.print(c + " ");
                c++;
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i2 + " ");
                i2++;
            }
            System.out.println();
        }

    }
}