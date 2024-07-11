package 문자열1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int i1 = (int) c1;
        int i2 = (int) c2;

        int sum = 0;
        int sub = 0;

        if(i1 > i2) {
            sum = i1 + i2;
            sub = i1 - i2;
        } else {
            sum = i1 + i2;
            sub = i2 - i1;
        }
        System.out.println(sum + " " + sub);

    }
}