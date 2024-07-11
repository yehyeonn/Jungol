package 배열1.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] iArr = new int[10];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] += i+1;
        }
        for(int i2 : iArr) {
            System.out.print(i2 + " ");
        }
    }
}
