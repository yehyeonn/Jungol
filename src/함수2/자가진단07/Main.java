package 함수2.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[10];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }

        bubble(iArr);

    }

    public static void bubble(int[] iArr) {
        int tmp = 0;
        for (int i = 0; i < iArr.length-1; i++) {
            for (int j = 0; j < iArr.length-1; j++) {
               if (iArr[j] < iArr[j+1]) {   // 0번 인덱스 수보다 1 번 인덱스 수가 클 때
                   tmp = iArr[j];           // 기존 0번 인덱스 값은 임의 변수에 저장
                   iArr[j] = iArr[j + 1];   // 1 번 인덱스 값은 0번째로 이동
                   iArr[j + 1] = tmp;       // 1번 뱅에 임시 저장했던 0 번 값을 저장
               }
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(iArr[j] + " ");
            }
            System.out.println();
        }
    }
}