package 배열2.자가진단04;


public class Main {
    public static void main(String[] args) {
        int[] iArr1 = {5, 8, 10, 6, 4};
        int[] iArr2 = {11, 20, 1, 13, 2};
        int[] iArr3 = {7, 9, 14, 22, 3};

        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d   ", iArr1[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d   ", iArr2[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d   ", iArr3[i]);
        }


    }

}