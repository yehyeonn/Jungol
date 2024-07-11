package 문자열2.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";
        String[] sArr = new String[20];
        while (true) {
            str = sc.nextLine();
            if (str.equals("END"))
                break;
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));

            }
            System.out.println();
        }


    }

}
