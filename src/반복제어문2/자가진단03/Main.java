package 반복제어문2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();

        for(int i = 1; i<=i1 ; i++) {
            if(i%2 == 0) {
                System.out.print(i + " ");
                continue;
            } else continue;

        }
    }
}
