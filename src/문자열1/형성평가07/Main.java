package 문자열1.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] str2 = str.trim().split( "\\s+");
        int i = 1;

        for(String answer : str2) {
            System.out.println(i + ". " + answer);
            i++;
        }

    }
}