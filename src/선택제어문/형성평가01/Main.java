package 선택제어문.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        if(i1 > i2) System.out.println(i1 - i2);
        else System.out.println(i2 - i1);
    }
}
