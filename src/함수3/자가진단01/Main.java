package 함수3.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();

        System.out.println(rept(i1));
    }

    public static String rept(int i1) {
        String str = "recursive\n";
        if(i1 == 0) {
            return "0";
        }
        else {
            str = str.repeat(i1);
        }
        return str;
    }
}
