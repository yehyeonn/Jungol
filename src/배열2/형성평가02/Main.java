package 배열2.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int[] iArr = new int[10];

        iArr[0] = i1;
        iArr[1] = i2;

        System.out.print(iArr[0] + " " + iArr[1] + " ");
        for (int i = 2; i < iArr.length; i++) {
            iArr[i] = iArr[i - 2] + iArr[i - 1];
            if(iArr[i] / 10 != 0) iArr[i] = iArr[i] % 10;
            System.out.print(iArr[i] + " ");
        }

    }
}