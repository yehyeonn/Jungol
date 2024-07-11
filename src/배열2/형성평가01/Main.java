package 배열2.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iArr[] = new int[11];

        int n;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }

        while (true) {
            n = sc.nextInt();
            if (n <= 100 && n > 0) {
                iArr[(n / 10)]++;
                n = -1;
            }
            if (n == 0) break;
        }

        for (int i = 10; i >= 0 ; i--) {
            if(iArr[i] != 0) {
                System.out.println((i)*10 + " : " + iArr[i] + " person");
            }
        }
    }
}