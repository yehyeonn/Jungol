package 함수3.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        findNum(n);

        sc.close();
    }

    public static void findNum(int n) {
        if(n == 0) return;
        findNum(n /2);
        System.out.print(n + " ");
    }
}


