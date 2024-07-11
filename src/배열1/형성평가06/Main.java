package 배열1.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];
        int tmp = 0;
        int max, min;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if(n[i] == 999) {
                tmp = i;
                break;
            }
        }

        max = n[0];
        min = n[0];

            for (int i = 0; i <tmp ; i++) {
                if(n[i] < min) min = n[i];
                if(n[i] > max) max = n[i];
            }


        System.out.println("max : " + max);
        System.out.println("min : " + min);

    }
}
