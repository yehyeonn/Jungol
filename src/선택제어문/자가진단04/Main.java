package 선택제어문.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();

        if(d1 <= 50.80) System.out.println("Flyweight");
        else if (d1 <= 61.23) {
            System.out.println("Lightweight");
        } else if (d1 <= 72.57) {
            System.out.println("Middleweight");
        } else if (d1 <= 88.45) {
            System.out.println("Cruiserweight");
        } else {
            System.out.println("Heavyweight");
        }
    }
}
