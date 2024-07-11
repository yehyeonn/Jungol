package 함수2.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] iArr = new int[n];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }
        min(n, iArr);
        for (int i = 0; i < n; i++) {
            System.out.print(iArr[i] + " ");
        }
    }

    public static void min(int n, int iArr[]) {
        int tmp = 0;

        for (int i = 1; i < iArr.length; i++) {
            for (int j = 0; j < n; j++) {
                if(iArr[i] > iArr[j]) {
                    tmp = iArr[i];
                    iArr[i] = iArr[j];
                    iArr[j] = tmp;
                }
            }

        }
    }
}
