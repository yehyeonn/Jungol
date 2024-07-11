package 함수2.자가진단06;

public class Main {
    public static void main(String[] args) {

        sum();

    }

    public static void sum() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.printf("%d + %d = %d\n", i, j, (i+j));
            }
        }
    }
}
