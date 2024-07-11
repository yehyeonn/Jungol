package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            int n = sc.nextInt();
            sum += n;
            count++;
            if(n == 0) {
                count--;
                break;
            }
        }
        System.out.print(sum + " ");
        System.out.print(sum/(count));
    }
}
