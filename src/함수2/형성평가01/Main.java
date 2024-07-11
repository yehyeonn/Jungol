package 함수2.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        print(descending(input()));
    }

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();

        int[] iArr = new int[i1];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }
        return iArr;
    }

    private static int[] descending(int[] iArr) {
        for (int i = 0; i < iArr.length-1; i++) {
            for (int j = 0; j < iArr.length-1; j++) {
                if(iArr[j] > iArr[j+1]) {
                    int tmp = iArr[j];
                    iArr[j] = iArr[j + 1];
                    iArr[j + 1] = tmp;
                }
            }
            }
        return iArr;
        }
        public static void print(int iArr[]) {
            for (int i = 0; i <iArr.length; i++) {
                System.out.print(iArr[i] + " ");
            }
        }
}