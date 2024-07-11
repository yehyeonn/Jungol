package 함수1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ggdan(n1, n2);

    }

    public static void ggdan(int n1, int n2) {
        if (n1 <= n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.printf("== %ddan ==\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf(i + " * " + j + " = %2d\n", (i * j));
                }
                System.out.println();
            }
        } else if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                System.out.printf("== %ddan ==\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf(i + " * " + j + " = %2d\n", (i * j));
                }
                System.out.println();
            }

        }

    }
}