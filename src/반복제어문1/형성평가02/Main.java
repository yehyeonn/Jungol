package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int cntOdd = 0;
        int cntEven = 0;

//        while (true) {
//
//        }
        for(;;) {
            i = sc.nextInt();
            if(i == 0) {
                break;
            }
            if(i % 2 == 1) cntOdd++;
            else cntEven++;
        }
        System.out.println("odd : " + cntOdd + "\neven : " + cntEven);

    }
}
