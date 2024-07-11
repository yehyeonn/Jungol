package 반복제어문1.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
