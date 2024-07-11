package 문자열1.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int i1;

        while (str.length() > 1) {
            i1 = sc.nextInt();
            if (i1 >= str.length()) str = str.substring(0, str.length() - 1); // 입력받은 번호가 길이 이상이라 마지막 문자 제거
            else str = str.substring(0, i1 - 1) + str.substring(i1);    // 아니면 해당 인덱스 번호 위치 제거
            System.out.println(str);
        }


    }
}