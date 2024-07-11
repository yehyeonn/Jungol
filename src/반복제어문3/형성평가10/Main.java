package 반복제어문3.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = 1;

        for (int i = 0; i < i1 ; i++) {
            for (int j = 0; j < i1; j++) {
                System.out.print(i2 + " ");
                i2+=2;
                if (i2 >= 10) i2 = 1;
            }
            System.out.println();
        }

    }
}