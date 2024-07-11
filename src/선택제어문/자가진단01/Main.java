package 선택제어문.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        System.out.println(i1);

        if (i1 < 0)
            System.out.println("minus");
    }
}
