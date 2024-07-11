package 함수3.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int sum = 0;

        System.out.println(square(i1, sum));
    }

    public static int square(int i1, int sum) {
        if(i1 < 1) {
            return sum;
        } else {
            sum += Math.pow(i1 % 10, 2);
            return square(i1/10, sum);
        }
    }
}
