package 반복제어문3.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n ; i+=2) {
            sum+=i;
            count++;
            if(sum >= n)
                break;
        }
        System.out.print(count + " " + sum);

    }
}
