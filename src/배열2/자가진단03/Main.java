package 배열2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[100];

        iArr[0] = 100;
        iArr[1] = sc.nextInt();
        System.out.print(iArr[0] + " " + iArr[1] + " ");
        for (int i = 2; i < iArr.length; i++) {
            iArr[i] = iArr[i - 2] - iArr[i - 1];
            System.out.print(iArr[i] + " ");
            if (iArr[i] < 0) {
                break;
            }

        }

    }

}