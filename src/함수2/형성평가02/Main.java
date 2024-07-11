package 함수2.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.println(compare(Math.sqrt(d1), Math.sqrt(d2)));  // 실수 2 개의 제곱근

        }

    private static int compare(double d1, double d2) {      // 실수 입력 받음
        int num = 0;

        double max = (d1 > d2) ? d1 : d2;   // d1 > d2면 max 에 d1
        double min = (d1 > d2) ? d2 : d1;   // d1 > d2면 min 에 d2

        min = Math.ceil(min);   // min 보다 큰 가장 작은 정수
        max = Math.floor(max);  // max 보다 작은 가장 큰 정수
        while (min <= max) {    // min 이 max 보다 작거나 같을 경우 무한 반복
            min++;
            num++;
        }
        return num;
    }
}