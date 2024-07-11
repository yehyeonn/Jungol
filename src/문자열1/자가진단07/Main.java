package 문자열1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 65 && c <=90) System.out.print(c);
            else if (c >= 97 && c <=122) System.out.print((char)(c-32));
        }
    }
}