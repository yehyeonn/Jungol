package 반복제어문3.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char tmp = 'A';

        for (int i = 0; i <n ; i++) {
            for (int j = n ; j > i ; j--) {
                System.out.print(tmp);
                tmp++;
            }
            System.out.println();
        }
    }
}
