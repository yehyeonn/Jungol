package 선택제어문.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        if (i1 > i2) {
            if (i2 > i3) {
                System.out.println(i3);
            } else System.out.println(i2);

        } else {    // i1 < i2
            if (i1 > i3) {
                System.out.println(i3);
            } else System.out.println(i1);


        }

    }
}
