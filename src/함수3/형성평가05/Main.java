package 함수3.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        num(n, 0);

        sc.close();
    }

    public static void num(int n, int count) {
        if(n == 1)
            System.out.println(count);
        else if(n % 2 == 0) num(n/2 , count+1);   //짝수이면
        else num(n/3, count +1);

    }

}