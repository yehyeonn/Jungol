package 함수3.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();

        System.out.println(getArr(i1));
    }

    private static int getArr(int i1) {
       if(i1 <= 1) return 1;
       else
           return getArr(i1/2) + getArr(i1-1);

    }
}
