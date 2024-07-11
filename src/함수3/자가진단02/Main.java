package 함수3.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        rept(i1);
    }

    public static void rept(int i1) {
        for (int i = i1; i >=1 ; i--) {
            System.out.print(i1 + " ");
            i1--;
        }
    }
}
