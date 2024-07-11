package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int sum = 0;
        int count = 0;
        double avg = 0;
        while (true) {
            i = sc.nextInt();
            if (i < 0 || i > 100) break;
            count++;
            sum += i;
            avg = ((double) sum / count);
        }

        //결과 출력
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
