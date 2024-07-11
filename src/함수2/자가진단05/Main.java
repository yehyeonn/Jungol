package 함수2.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d[] = new double[3];

        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(d[i] > d[j]) {
                    double tmp = d[i];  // 가장 큰 수를 맨 앞에 둠
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
        }
        sout(d[0], d[1], d[2]); // 0 => 가장 큰 수, 2 번: 가장 작은 수

    }

    public static void sout(double max, double mid, double min) {
        max = Math.ceil(max);
        min = Math.floor(min);

        System.out.print((int)max + " " + (int)min + " " + Math.round(mid));

    }

}