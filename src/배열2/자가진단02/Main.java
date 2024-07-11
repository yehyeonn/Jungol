package 배열2.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[10];
        int i1;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }


        while (true) {
            i1 = sc.nextInt();
            if (i1 == 0) break;
            iArr[(int) (i1 / 10)]++;
        }

        for (int i = 0; i < 10; i++) {
            if (iArr[i] != 0) {
                System.out.print(i + " : ");
                System.out.println(iArr[i]);
            }
        }
    }
}