package 반복제어문2.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > n2) {
            for (int i = n2 ; i<= n1 ; i++) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = n1; i <=n2 ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
