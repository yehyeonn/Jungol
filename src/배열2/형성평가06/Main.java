package 배열2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iArr1[][] = new int[2][3];
        int iArr2[][] = new int[2][3];
        int answer[][] = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                iArr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                iArr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                answer[i][j] = iArr1[i][j] * iArr2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}