package 배열2.자가진단07;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iArr[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0 || j == 0) {
                    iArr[i][j] = 1;
                } else {
                    iArr[i][j] = iArr[i - 1][j] + iArr[i][j-1];
                }
                System.out.print(iArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}