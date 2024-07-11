package 함수3.형성평가04;

import java.util.Scanner;
/*
첫 번째는 1, 두 번째는 2, 세 번째부터는 앞의 두 수의 곱을 100으로 나눈 나머지로 이루어진 수열이 있다.

        100 이하의 자연수 N을 입력받아 재귀함수를 이용하여 N번째 값을 출력하는 프로그램을 작성하시오.*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[102];
        arr[0] = 1;
        arr[1] = 2;
        int n = sc.nextInt();
        int count = 2;  // 배열 번호

        ret(arr, n, count);
    }

    // N번째 값 출력
    // N-2 번째 값 ,  N-1 번째 값 , N번째 값 출력

    private static void ret(int[] arr, int n, int count) {
        arr[count] = arr[count - 2] * arr[count - 1] % 100; //2번 배열 => 3번값 부터 도는 재귀함수
        count++;                                            // 배열 돌고 다음 배열로
        if (n > count)                                       // 목표한 값보다 작으면(같으면 다음 배열도 출력되기 때문에)
            ret(arr, n, count); //재귀함수 출력
        else {
            System.out.println(arr[count - 1]);              // 목표한 배열까지 출력하고 종료
            return;                                         //종료조건(입력 받은 값보다 인덕스 값이 같거나 클 때)
        }
    }
}
