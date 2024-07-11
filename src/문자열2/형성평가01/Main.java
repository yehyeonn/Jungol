package 문자열2.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] sArr = str.trim().split("\\s+");

        for (int i = sArr.length-1; i >= 0 ; i--) {
            System.out.println(sArr[i]);

        }

    }
}
