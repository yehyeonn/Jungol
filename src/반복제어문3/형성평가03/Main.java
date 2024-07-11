package 반복제어문3.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 증가 방향
        for(int i = 0 ; i <n ; i++) {   // n 개의 행
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 감소 방향
        for(int i = 0 ; i <= (n-1) ; i++) {    //n-1 개의 행
            // for(int j = 0 ; j < (n-i-1) ; j--) {     내가 쓴 답
            for(int j = (n-i-1) ; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
