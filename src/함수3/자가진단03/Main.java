package 함수3.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        System.out.println(reptSum(i1));
    }

    public static int reptSum(int i1) {
        int sum = 0;
        for (int i = 1; i <=i1 ; i++) {
            sum += i;
        }
        return sum;
    }
}
