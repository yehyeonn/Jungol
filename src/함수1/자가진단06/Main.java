package 함수1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        char c = sc.next().charAt(0);
        int n2 = sc.nextInt();

        System.out.printf("%d %c %d", n1, c, n2);


        if (c == '+')
            System.out.println(" = " + (n1 + n2));
        else if (c == '-')
            System.out.println(" = " + (n1 - n2));
        else if (c == '*')
            System.out.println(" = " + (n1 * n2));
        else if (c == '/')
            System.out.println(" = " + (n1 / n2));
        else System.out.println(" = 0");


    }
}