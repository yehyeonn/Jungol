package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            int i = sc.nextInt();
            if(i == 0) break;
            if (i%3 != 0 && i%5 != 0) num++;
        } System.out.println(num);
    }
}
