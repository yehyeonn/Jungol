package 배열2.형성평가03;
public class Main {
    public static void main(String[] args) {

        int iArr[][] = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += iArr[i][j];
                System.out.print(iArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}