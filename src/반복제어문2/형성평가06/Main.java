package 반복제어문2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int sum = 0;
        int count = 0;

        if (i1 > i2) {
            for (int i = i2; i <= i1; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        } else if (i2 > i1) {
            for (int i = i1; i <= i2; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        } else {
            if(i1 % 3 == 0 || i1 % 5 == 0) {
                sum += i1;
                count++;
            }
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double) sum / count);
    }
}
