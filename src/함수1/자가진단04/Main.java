package 함수1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        for (int i = 0; i <3 ; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];

        for (int i = 1; i <3 ; i++) {
            if(max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(max);


    }
}