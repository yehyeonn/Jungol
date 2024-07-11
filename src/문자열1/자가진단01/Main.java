package 문자열1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("ASCII code =? ");
            int num = sc.nextInt();
            if(num >= 33 && num <=127) {
                char c = (char) num;
//                System.out.println(c);
                System.out.print(c + "\n");
            }
            else break;
        }


    }
}
