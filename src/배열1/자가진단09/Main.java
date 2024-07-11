package 배열1.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int tmp = 0;

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }
        for (int i = 0; i < iArr.length ; i++) {
            for (int j = i; j < iArr.length ; j++) {
                if(iArr[i] < iArr[j]) {
                    tmp = iArr[i];
                    iArr[i] = iArr[j];
                    iArr[j] = tmp;
                }
            }
        }
        for (int answer : iArr)
            System.out.print(answer + " ");
        }

    }
