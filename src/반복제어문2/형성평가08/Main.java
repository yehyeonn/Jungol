package 반복제어문2.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int height = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
