package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] score = new int[length];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = i+1; j < score.length; j++) {
                if (score[j] > score[i]) {
                    max = score[i];
                    score[i] = score[j];
                    score[j] = max;
                }
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }


}

