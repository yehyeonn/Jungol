package 문자열2.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = {"flower", "rose", "lily", "daffodil", "azalea"};
        char c = sc.nextLine().charAt(0);
        int count = 0;


        for (int i = 0; i < sArr.length; i++) {
            for (int j = 1; j <= 2; j++) {
                if (sArr[i].charAt(j) == c) {
                    System.out.println(sArr[i]);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}