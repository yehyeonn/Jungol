package 함수1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int result = (int) Math.pow(i1, i2);

        System.out.println(result);

    }
}