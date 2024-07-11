package 문자열2.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[100];
        String str = "";
        int count = 0;
        for (int i = 0; i < sArr.length; i++) {
            str = sc.nextLine();
            sArr[i] = str;
            if (str.equals("0")) break;
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.println(sArr[i]);


            }
        }
    }


}

