package 함수3.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        int i4 = i1 * i2 * i3;

        System.out.println(multi(i4));

    }

    private static int multi(int i4) {
        if(i4==0) return 1; // 0 을 곱할 수 없으니 1로 쳐서 곱셈에 영향을 주지 않음
        if(i4%10 != 0) return (i4 % 10) * multi(i4 / 10);   // 한 자리 * 남은 자리를 다시 돌림
        else return (1 % 10) * multi(i4 / 10);  //i4가 한자리 남았을 때는 1*몫(한자리) 해서 리턴
    }

}