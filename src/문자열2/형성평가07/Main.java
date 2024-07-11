package 문자열2.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String str1 = sc.next();
        String str2 = sc.next();

        for (int i = 0; i < str1.length(); i++) {
            if ('0' <= str1.charAt(i) && str1.charAt(i) <= '9')
                sb.append(str1.charAt(i));
            else break;
        }
        for (int i = 0; i < str2.length(); i++) {
            if ('0' <= str2.charAt(i) && str2.charAt(i) <= '9')
                sb2.append(str2.charAt(i));
            else break;
        }

        Integer num = Integer.parseInt(sb.toString()) * Integer.parseInt(sb2.toString());

        System.out.println(num);
    }
}