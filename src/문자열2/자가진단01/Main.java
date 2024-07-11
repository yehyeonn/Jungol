package 문자열2.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sArr = new String[5];
        for (int i = 0; i < 5; i++) {
            sArr[i] = sc.nextLine();
        }

        for (int i = sArr.length - 1; i >= 0; i--) {
            System.out.println(sArr[i]);
        }

    }

}