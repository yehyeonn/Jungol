package 배열1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        int min = num[0];

        for (int i = 1; i < num.length; i++) {
           if (num[i] < min) min = num[i];
        }
        System.out.print(min);

    }
}
