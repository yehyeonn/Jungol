package 배열2.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            num = sc.nextInt();
        } while(num < 1 || num > 10);


        int iArr[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                iArr[i][j] = 0;
            }
        }

        for (int i = 0; i < num; i++) {
            iArr[i][0] = 1;
            if(i != 0) {
                iArr[i][i] = 1;
            }
        }
        for (int i = 2; i < num; i++) {
            for (int j = 1; j < num; j++) {
                iArr[i][j] = iArr[i - 1][j - 1] + iArr[i - 1][j];
            }
        }
        for (int i = num-1; i >= 0 ; i--) {
            for (int j = num-1; j >= 0 ; j--) {
                if(iArr[i][j] != 0) {
                    System.out.print(iArr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}