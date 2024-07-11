package 함수2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int rep = 7;
        int[] iArr = new int[rep];
        for (int i = 0; i < rep; i++) {
            iArr[i] = sc.nextInt();
        }

        rept(iArr);
    }

    private static void rept(int[] iArr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < iArr.length-1; j++) {
                if(iArr[j] > iArr[j+1]) {
                    int tmp = iArr[j];
                    iArr[j] = iArr[j + 1];
                    iArr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }
    }


}