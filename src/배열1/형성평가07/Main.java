package 배열1.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[100];
        int tmp = 0;
        int multiple;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
            if(iArr[i] == 0) {
                tmp = i;
                break;
            }
        }

        for (int i = 0; i < tmp; i++) {
            multiple = iArr[i];
            if(multiple % 5 == 0) {
                count++;
                sum += multiple;
            }
        }
        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double)sum/count);


    }
}
