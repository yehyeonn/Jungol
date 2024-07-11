package 함수2.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        System.out.println(date(i1, i2));
    }

    public static String date(int i1, int i2) {
        int one[] = {1, 3, 5, 7, 8, 10, 12};
        int zero[] = {4, 6, 9, 11};

        for (int i = 0; i < one.length; i++) {
            if (i1 == one[i]) {
                if (i2 >= 1 && i2 <= 31)
                    return "OK!";
            } else if (i2 <= 0 || i2 >= 32) return "BAD!";
        }

        for (int i = 0; i < zero.length; i++) {
            if (i1 == zero[i]) {
                if (i2 >= 1 && i2 <= 30)
                    return "OK!";
            } else if (i2 >= 31 || i2 <= 0) return "BAD!";
        }

        if(i1 == 2) {
            if(i2 > 29 || i2 < 1) {
                return "BAD!";
            } else {
                return "OK!";
            }
        }
        return "BAD!";


    }
}
