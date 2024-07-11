package 함수1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iArr[][] = new int[4][4];
        score(iArr);
    }

    public static void score(int[][] n) {
        Scanner sc = new Scanner(System.in);

        int[][] iArr = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = sc.nextInt();
                iArr[i][j] = n[i][j];
                iArr[i][3] += n[i][j];
                iArr[3][j] += n[i][j];
                iArr[3][3] += n[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(iArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}