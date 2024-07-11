package 반복제어문3.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 줄어들기
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //늘어나기
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > n-i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
