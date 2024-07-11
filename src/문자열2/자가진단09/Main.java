package 문자열2.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[5];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.next();
        }

        String tmp = "";

        for (int i = 0; i < 4; i++) {       // 첫번째, 두번째 받은 값
            for (int j = i + 1; j < 5; j++) {   // i 가 첫번째 일때 2,3번째 && i가 두 번째일 때는 세번째 값 비교
                if (sArr[i].compareTo(sArr[j]) < 0) {        // sArr[i] 가 sArr[j] 보다 작은 경우
                    tmp = sArr[i];  //tmp 에는 큰 수(사전적으로 뒤에 있는)
                    sArr[i] = sArr[j];
                    sArr[j] = tmp;
                }

            }

        }
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }

    }

}