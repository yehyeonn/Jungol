package 문자열1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String sArr[] = str.split("");


        for (int i = 0; i <sArr.length; i++) {
            char c = str.charAt(i);
            if(c >= 65 && c<= 90)
                System.out.print((char)(c+32));
            else if(c >= 97 && c <= 122)
                System.out.print(c);
            else if(c >= 48 && c <= 57)
                System.out.print(c);
        }
    }
}