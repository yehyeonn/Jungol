package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        int class1 =sc.nextInt();
        int class2 =sc.nextInt();

        System.out.printf("%.1f", (score[class1-1]+score[class2 -1]));

    }
}
