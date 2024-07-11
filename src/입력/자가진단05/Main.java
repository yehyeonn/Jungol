package 입력.자가진단05;

public class Main {
    public static void main(String[] args) {
        double yd = 2.1;
        double in = 10.5;
        double ydcm = yd*91.44;
        double incm = in*2.54;
        System.out.printf("%4.1fyd = %5.1fcm \n%.1fin = %5.1fcm", yd, ydcm, in, incm);
    }
}
