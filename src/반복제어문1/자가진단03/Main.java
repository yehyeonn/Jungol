package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("number? ");
                int i = sc.nextInt();
                while (i != 0) {
                    if (i > 0) {
                        System.out.println("positive integer");
                        break;
                    } else if (i < 0) {
                        System.out.println("negative number");
                        break;
                    } else
                        System.out.println(i);
                    break;
                }
                if (i == 0)
                    break;
            }


    }
}
