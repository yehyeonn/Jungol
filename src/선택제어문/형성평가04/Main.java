package 선택제어문.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number? ");
        int i = sc.nextInt();

        if(i == 1) System.out.println("dog");
        else if (i == 2) System.out.println("cat");
        else if (i == 3) System.out.println("chick");
        else System.out.println("I don't know.");



    }
}
