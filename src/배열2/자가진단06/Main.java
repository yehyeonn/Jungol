package 배열2.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][4];
        int[] sum = new int[5];
        int pass = 0;

        for(int i = 0 ; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum[i] += arr[i][j];
            }

            if((sum[i]/4) < 80) System.out.println("fail");
             else {
                System.out.println("pass");
                pass++;
            }
        }
        System.out.println("Successful : " + pass);
    }
}
