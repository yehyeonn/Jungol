package 함수3.형성평가03;


/*
문제
자연수 N과 M을 입력받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오. 단, N은 10 이하의 정수이다.

 : 줄바꿈,  : 공백
[입력]
3 10

[출력]
1 3 6
1 4 5
1 5 4
1 6 3
2 2 6
2 3 5
…
6 2 2
6 3 1

 */
import java.util.Scanner;
public class Main {

    public static int[] sum = new int[10];
    public static int a = 0;    // 배열값 0 을 넣고 시작

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        dice(n, m);

        sc.close();
    }

    // n번 던져서 나온 눈의 합이 m 이어야 함.
    // n : 1 ~ 이상
    private static void dice(int n, int m) {
        int i = 0;
        for (i = 1; i <= 6; ++i) {  // 첫번째 세로줄 값이 1 ~ 6 ==> 밑을 i 가 1~6까지 호출한다
            sum[a] = i;
            if (a == n - 1) {      // 총 n 칸 동안 받고 출력하기 위함(sum[2])   ex) n =3, sum[0], sum[1], sum[2]
                // 현재까지 (a 회) 까지의 주사위 던진 눈의 합
                int total = 0;
                for (int j = 0; j <= a; ++j)            // total += sum[0~2]
                    total += sum[j];

                if (total == m) {              // 종료조건.     total == m => 눈의 합이 m
                    for (int k = 0; k < n; ++k)
                        System.out.printf("%d ", sum[k]);       // sum[0] sum[1] sum[2] 출력
                    System.out.println();                       // 다음 줄로 넘기고
                    return;                                     //를 출력
                }
            }
            else                            // (a != n - 1) => n이 3이면 sum[0] sum[1]인 경우
            {
                a++;                        // a++;
                dice(n, m);  // 재귀 호출   // 아니면 다시 a++ 후 재귀, 47번 if 절에 걸릴 떄까지(n번)
                a--;
            }
        }
    }
}
