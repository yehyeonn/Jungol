package 반복제어문2.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            if(i% 5 == 0) sum+=i;
        }
        System.out.println(sum);
    }
}
