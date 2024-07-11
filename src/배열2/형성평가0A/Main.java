package 배열2.형성평가0A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iArr[] = new int[6];

        int n;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            do {
                n = sc.nextInt();
            } while (n > 6 || n < 0);
            iArr[n - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " : " + iArr[i]);
        }
    }
}