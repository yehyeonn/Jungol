package 함수3.자가진단05;

import java.util.Scanner;
/*
문제
10 이하의 자연수 N을 입력받아 주사위를 N번 던져서 나올 수 있는 모든 경우를 출력하되 중복되는 경우에는 앞에서부터 작은 순으로 1개만 출력하는 프로그램을 작성하시오.

 : 줄바꿈,  : 공백
[입력]
3

[출력]
1 1 1
1 1 2
...
1 1 6
1 2 2
1 2 3
...
5 6 6
6 6 6

 */

public class Main {
    public static int n;
    public static int[] arr = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr[0] = 1; // 주사위는 1부터 시작하기 때문
        re(1);

    }

    private static void re(int level) {
        int i;
        if (level > n) {    //// 48에서 +1을 한 값이 n 보다 클 때
            output();  // 행 (row) 를 출력
            return;  // 재귀 종료
        }

        for (i = arr[level - 1]; i <= 6; i++) {
            arr[level] = i;     // arr[0]~ arr[5] 에 각각 (세로줄) 1~6 넣음
            re(level + 1);  // 다음 level 의 주사위  ...
        }
    }

    private static void output() {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}

        // (46 for 문으로) arr[1] = 1, (46번 for 문으로)arr[2] = 1 ,(46번 for 문으로) arr[3] =1
        // => 한 줄 구하기 위한 문장/ 추후 112, 113,114.. 식으로 증가
    // 46 번에 arr[level-1] 로 바로 전 원소부터 사용(중복 x)
    // ex) 122 구하기 위해서는 arr[1] =1, arr[2] = 2, arr[3] =2
    // leven == 3 일때 arr[2] = 2, arr[3] = 2


