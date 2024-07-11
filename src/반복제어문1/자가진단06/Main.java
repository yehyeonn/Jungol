package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");

            int i = sc.nextInt();
            if(i == 1) {
                System.out.println("\nSeoul");
                System.out.println();
            }
            else if(i == 2) {
                System.out.println("\nWashington");
                System.out.println();
            }
            else if (i == 3) {
                System.out.println("\nTokyo");
                System.out.println();
            }
            else if (i == 4) {
                System.out.println("\nBeijing");
                System.out.println();
            }
            else {
                System.out.println("\nnone");
                System.out.println();
                break;
            }

        }

    }
}
