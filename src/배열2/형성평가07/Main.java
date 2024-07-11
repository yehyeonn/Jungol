package 배열2.형성평가07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iArr[][] = new int[4][2];

        int sum = 0;

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 2; j++) {
                iArr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            sum += iArr[i][0] + iArr[i][1];
            System.out.print(sum/2 + " ");
            sum = 0;
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            sum += iArr[0][i] + iArr[1][i] + iArr[2][i] + iArr[3][i];
            System.out.print(sum/4 + " ");
            sum = 0;
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                sum += iArr[i][j];
            }
        }
        System.out.println(sum/8);
    }
}