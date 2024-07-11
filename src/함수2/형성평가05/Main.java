package 함수2.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dArr = new double[3];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = sc.nextDouble();
        }

        dsum1(dArr);
        dsum2(dArr);

    }

    private static void dsum1(double[] dArr) {
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < dArr.length; i++) {
            sum += dArr[i];
        }

        avg = sum / dArr.length;
        System.out.println(Math.round(avg));

    }

    private static void dsum2(double[] dArr) {
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = Math.round(dArr[i]);
            sum += dArr[i];
        }
        avg = sum / dArr.length;
        System.out.println(Math.round(avg));

    }


}