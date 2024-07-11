package 함수2.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[5];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }
        System.out.println(sum(iArr));
    }

    private static int sum(int[] iArr) {
        int sum = 0;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 0) {
                sum += iArr[i] * -1;
            } else {
                sum += iArr[i];
            }
        }
        return sum;
    }
}