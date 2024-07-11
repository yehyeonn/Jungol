package 배열1.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[100];
        int tmp = 0;


        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
            if (iArr[i] == 0) {
                break;
            }
        }


        for (int i = 0; i < tmp; i++) {
            if (iArr[i] % 2 == 0)
                System.out.print(iArr[i] / 2 + " ");
            else System.out.print(iArr[i] * 2 + " ");
        }
    }

}

