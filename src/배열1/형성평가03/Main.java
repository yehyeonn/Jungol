package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int[] array = new int[100];
            int i;
            for (i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (array[i] == -1) break;
            }

                int startIndex = (i -3 >= 0) ? i -3 : 0;

                for (int n = startIndex; n < i ; n++) {
                    System.out.print(array[n] + " ");
                }
                System.out.println();

            }

}
