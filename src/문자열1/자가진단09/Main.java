package 문자열1.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count;
        char[] c = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            count = str.length() - 1 - i;
            for (int j = 0; j < str.length(); j++) {
                if(count == str.length()) {
                    count = 0;
                }
                System.out.print(c[count]);
                count++;
            }
            System.out.println();
        }
    }
}