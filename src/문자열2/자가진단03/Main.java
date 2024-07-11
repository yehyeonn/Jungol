package 문자열2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[10];
        
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.nextLine();
        }

        char c = sc.nextLine().charAt(0);
        String temp = "";
        char c2;

        for (int i = 0; i < sArr.length; i++) {
            temp = sArr[i];
            c2 = temp.charAt(temp.length()-1);
            if(c2 == c) System.out.println(temp);
        }

    }

}