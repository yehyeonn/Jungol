package 반복제어문2.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for (int i = 0 ; i < 10; i++) {
            int n = sc.nextInt();
            if(n%2 == 0) even++;
            else odd++;
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
