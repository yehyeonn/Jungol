package 반복제어문2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < i1 ; i++) {
            int i2 = sc.nextInt();
            sum += i2;
        }
        System.out.printf("%.2f", (double)sum/i1);


    }
}
