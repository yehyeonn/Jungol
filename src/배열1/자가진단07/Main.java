package 배열1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        int min = 10000;
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i] >= 100 && num[i] <= min)     //100 이상인 수인 경우
                min = num[i];

            if(num[i] < 100 && num[i] >= max)
                max = num[i];
        }
        if (max == 0)
            System.out.print(100 + " ");
        else
            System.out.print(max+ " ");

        if(min == 10000) {
            min = 100;
            System.out.print(min);
        }
        else
            System.out.print(min);

    }
}