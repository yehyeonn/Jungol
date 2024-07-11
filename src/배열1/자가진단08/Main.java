package 배열1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }

        for (int i = 1; i < iArr.length; i += 2) {
            sum += iArr[i];
        }

        for (int i = 0; i < iArr.length ; i+=2) {
            avg += iArr[i];
        }

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg/5);
        }

    }

