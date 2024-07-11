package 배열1.형성평가0A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] iArr = new String[10];
        String str2 = "";

        for (int i = 0; i < iArr.length; i++) {
            str2 = sc.next();
            iArr[i] = str2;
        }
        for (int i = iArr.length-1; i >= 0 ; i--) {
            System.out.print(iArr[i] + " ");

        }
        }

    }