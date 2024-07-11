package 문자열2.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        String str = sc.next();
        double d2 = Math.round(d1 * 1000.000) / 1000.000;
        String newStr = i1 + (d2 + str);
        int half = newStr.length() / 2;

        if (newStr.length() % 2 == 1) {
            for (int i = 0; i <= half; i++) {
                System.out.print(newStr.charAt(i));
            }
            System.out.println();
            for (int i = half + 1; i < newStr.length(); i++) {
                System.out.print(newStr.charAt(i));
            }
        } else {
            for (int i = 0; i < half; i++) {
                System.out.print(newStr.charAt(i));
            }
            System.out.println();
            for (int i = half; i < newStr.length(); i++) {
                System.out.print(newStr.charAt(i));
            }


        }


    }

}