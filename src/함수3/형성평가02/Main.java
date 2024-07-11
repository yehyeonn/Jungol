package 함수3.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2 != 0) oddNum(n);
        else evenNum(n);

        sc.close();
    }

    public static void oddNum(int n) {
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void evenNum(int n) {
        for (int i = 2; i <= n ; i+=2) {
            System.out.print(i + " ");
        }

    }
}