package 문자열2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String a = sc.next();
        String b = sc.next();
        int num = sc.nextInt();

        String str = a.concat(b);
        System.out.println(str);

        for (int i = 0; i < num; i++) {
            sb.append(str.charAt(i));
        }

        if(num < b.length()) {
            for (int i = num; i < b.length(); i++) {
                sb.append(b.charAt(i));
            }
        }

        System.out.println(sb);

    }

}