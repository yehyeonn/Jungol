package 반복제어문3.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1 ; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i+1 ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
