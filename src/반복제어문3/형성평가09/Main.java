package 반복제어문3.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        for (int i = 1; i < i1 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int i = 0; i < i1; i++) {  //내려가기
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i1 - i; j++) {
                System.out.print("# ");
            }


            System.out.println();
        }

    }
}