package 함수2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        System.out.println(repeat(i1));
    }

    private static int repeat(int i1) {
        int two = 2;
        for (int i = 1; i < i1 ; i++) {
            two *= 2;
        }
        return two;
    }
}