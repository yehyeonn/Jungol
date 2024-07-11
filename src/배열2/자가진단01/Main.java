package 배열2.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[26];
        for (int i = 0; i < 26; i++) {
            iArr[i] = 0;
        }
        while (true) {
            char c = sc.next().charAt(0);
            if (c < 'A' || c > 'Z') break;
            iArr[(int) c - 65]++;   //A 아스키 코드가 65 => 숫자로 변형하는 것
        }
        for (int i = 0; i < 26; i++) {
            if (iArr[i] != 0) {
                System.out.print((char) (i + 65) + " : ");
                System.out.println(iArr[i]);
            }
        }


    }


}
