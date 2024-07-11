package 반복제어문3.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        while (true) {
            i++;
            if (n*i > 100) break;
            System.out.print(n*i + " ");
            if (n*i % 10 == 0)
                break;

        }

    }
}
