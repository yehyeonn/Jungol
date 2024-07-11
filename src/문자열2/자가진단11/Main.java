package 문자열2.자가진단11;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[5];
        String str = "";
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.next();
            str += sArr[i];
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            count++;
            if(count % 3 == 0) System.out.println();
        }


    }
}
