package 문자열1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        int i1 = str.length();
        int i2 = str2.length();

        if(i1 > i2) System.out.println(i1);
        else System.out.println(i2);
    }
}