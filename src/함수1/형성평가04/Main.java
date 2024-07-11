package 함수1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        sub(i1, i2);
    }

    public static void sub(int i1, int i2) {
        int ans = 0;
      if(i1 >= i2) {
          ans = (i1 * i1) - (i2 * i2);
          System.out.println(ans);
      } else {
          ans = (i2 * i2) - (i1 * i1);
          System.out.println(ans);
      }
    }
}