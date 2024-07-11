package 반복제어문2.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 1; i <= 9; i++) {
            if (dan > n) {
                for (int j = dan; j >= n; j--) {
                    if (j * i >= 10) {
                        System.out.print(j + " * " + i + " = " + i * j + "   ");
                    } else {
                        System.out.print(j + " * " + i + " =  " + i * j + "   ");
                    }
                }
                System.out.println();
            } else if (n > dan) {
                for (int j = dan; j <= n; j++) {
                    if (j * i >= 10) {
                        System.out.print(j + " * " + i + " = " + i * j + "   ");
                    } else {
                        System.out.print(j + " * " + i + " =  " + i * j + "   ");
                    }
                }
                System.out.println();
            } else if (dan == n) {
                for (int j = dan; j < dan + 1; j++) {
                    if (j * i >= 10) {
                        System.out.print(j + " * " + i + " = " + i * j + "   ");
                    } else {
                        System.out.print(j + " * " + i + " =  " + i * j + "   ");
                    }
                }
                System.out.println();

            }
        }
    }
}