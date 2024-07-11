package 문자열2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        String[] sArr = new String[i1];
        String tmp = "";

        for (int i = 0; i < i1; i++) {
            sArr[i] = sc.next();
        }


        for (int i = 0; i < i1; i++) {
            for (int j = i+1; j < i1; j++) {
                if (sArr[i].compareTo(sArr[j]) > 0) {
                    tmp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < i1; i++) {
            System.out.println(sArr[i]);
        }
    }
}