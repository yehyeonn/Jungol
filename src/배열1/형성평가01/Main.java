package 배열1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[5];
        int num = 0;

        for (int i = 0; i < iArr.length; i++) {
            num = sc.nextInt();
            iArr[i] = num;
        }
        int sum = iArr[0] + iArr[2] + iArr[4];
        System.out.println(sum);
        }

    }