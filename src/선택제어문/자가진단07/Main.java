package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c == 'A') System.out.println("Excellent");
        else if (c == 'B') System.out.println("Good");
        else if (c == 'C') System.out.println("Usually");
        else if (c == 'D') System.out.println("Effort");
        else if (c == 'F') System.out.println("Failure");
        else System.out.println("error");

    }
}
