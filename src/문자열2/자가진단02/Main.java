package 문자열2.자가진단02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] sArr = str.trim().split("\\s+");

        for (int i = 0; i < sArr.length; i++) {
           if(i%2 == 0) System.out.println(sArr[i]);
        }

    }

}