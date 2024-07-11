package 반복제어문1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num = 0;

        while (true) {
            int i = sc.nextInt();
            sum += i;
            num++;

            if(i >= 100) {
                System.out.println(sum);
                System.out.printf("%.1f", (double) sum/num);
                break;
            }
        }





    }
}

