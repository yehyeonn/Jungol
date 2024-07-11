package 배열1.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] c = new char[10];
        String str = "";
        for (int i = 0; i < c.length; i++) {
            str = sc.next();
            c[i] = str.charAt(0);
        }
        for (int i = 0; i < 9 ; i+=3) {
            System.out.print(c[i] + " ");
        }
    }
}