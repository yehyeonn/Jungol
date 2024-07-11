package 문자열1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] str2 = str.split(" ");
        System.out.println(str2.length);
    }
}