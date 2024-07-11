package 배열2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] iArr= new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print(i+1 + "class? ");
            for (int j = 0; j < 3; j++) {
                iArr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += iArr[i][j];
            }
            System.out.print(i+1 + "class : " + sum);
            System.out.println();
            sum = 0;
        }

    }
}