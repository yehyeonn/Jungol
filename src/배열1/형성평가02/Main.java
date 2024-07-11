package 배열1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }
        for (int i = 0; i < iArr.length; i+=2) {
            sum1 += iArr[i];
        }
        for (int i = 1; i <iArr.length ; i+=2) {
            sum2 += iArr[i];
        }
        System.out.println("odd : " + sum1);
        System.out.println("even : " + sum2);
        }

    }