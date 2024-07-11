package 문자열1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            char c = sc.nextLine().charAt(0);
            if (((int) c >= 65 && (int)c <= 90) || (int)c >= 97 && (int)c <= 122) {
                System.out.println(c);
            } else if((int)c >= 48 && (int)c <=57) {
                System.out.println((int)c);
            } else break;
        }

    }
}