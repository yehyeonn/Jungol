package 함수1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "~!@#$^&*()_+|\n";

        System.out.print(ans.repeat(n));
    }
}
