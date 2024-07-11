package 문자열2.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[5];
        char[] c1 = new char[100];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.next();
        }

        String str1 = sc.next();
        String str2 = sc.next();
        int count =0;
        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < sArr[i].length(); j++) {
                c1[j] = sArr[i].charAt(j);
                if(sArr[i].contains(str1)) {
                    System.out.println(sArr[i]);
                    count++;
                    break;
                } else if(sArr[i].contains(str2)) {
                    System.out.println(sArr[i]);
                    count++;
                    break;
                }
            }

        }
        if(count == 0) {
            System.out.println("none");
        }

    }
}