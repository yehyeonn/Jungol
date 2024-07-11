package 배열1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] d = new double[6];
        double weight = 0;

        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextDouble();
            weight += d[i];
        }
        System.out.printf("%.1f", weight/6);
    }
}
