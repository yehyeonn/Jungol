package 문자열2.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String[] sArr2 = str2.split("");

        String answer = str1.substring(0,2);

        for (int i = 2; i < sArr2.length ; i++) {
            answer += sArr2[i];
        }
        answer += str1.substring(0, 2);
        System.out.println(answer);
    }

}