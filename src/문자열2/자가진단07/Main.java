package 문자열2.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        if(str1.contains("c")) System.out.print("Yes ");
        else System.out.print("No ");
        if(str1.contains("ab")) System.out.print("Yes");
        else System.out.print("No");


    }
}