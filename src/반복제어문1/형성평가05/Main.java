package 반복제어문1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Base = ");
            int base = sc.nextInt();
            System.out.print("Height = ");
            int height = sc.nextInt();
            double avg = (double) (base * height)/2;
            System.out.printf("Triangle width = %.1f", avg);
            System.out.println();
            System.out.print("Continue? ");
            String answer = sc.next();
            if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y')
                continue;
            else break;
        }
    }
}
