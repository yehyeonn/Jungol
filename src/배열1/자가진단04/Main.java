package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[100];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
            if(iArr[i] == 0) break;
        }
        for (int i = (iArr.length)-1; i >= 0 ; i--) {
            if(iArr[i] != 0) System.out.print(iArr[i] + " ");
        }
    }
}