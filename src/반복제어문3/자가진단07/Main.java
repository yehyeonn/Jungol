package 반복제어문3.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;
        char tmp = 'A';

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j <= n ; j++) {
                System.out.print(m + " ");
                m++;
            }
            for (int j = 1 ; j <= i+1 ; j++) {
                System.out.print(tmp + " ");
                tmp++;

            }


            System.out.println();
        }
    }
}
