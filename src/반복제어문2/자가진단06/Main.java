package 반복제어문2.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n ; i++) {
            int n2 = sc.nextInt();
            sum += n2;
            count++;
        }
        if(sum/count >= 80) {
            System.out.printf("avg : %.1f\n", (double)sum/count);
            System.out.println("pass");
        } else {
            System.out.printf("avg : %.1f\n", (double)sum/count);
            System.out.println("fail");
        }
    }
}
