package 배열2.형성평가05;

public class Main {
    public static void main(String[] args) {
        int iArr[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                iArr[i][j] = 0;
            }
        }
        iArr[0][0] = iArr[0][2] = iArr[0][4] = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 0) iArr[i][j] = iArr[i-1][j + 1];   // 처음 시작이면 위 행의 오른쪽만 존재
                else if(j == 4) iArr[i][j] = iArr[i - 1][j - 1];    //마지막 이면 위 행의 왼쪽만 존재
                else iArr[i][j] = iArr[i - 1][j - 1] + iArr[i - 1][j + 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(iArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}