package 문자열2.자가진단10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();
//        char[] c = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(('0' <= str.charAt(i) && str.charAt(i) <= '9')||  str.charAt(i) == '.')
                sb.append(str.charAt(i));
            else {
                break;
            }
            if (str.charAt(i) == '.' && str.charAt(i+1) == '.') {
                break;
            }
        }

//        System.out.println(sb);
        Double d1 = Double.parseDouble(sb.toString());

        System.out.println(Math.round(d1) * 2);
        System.out.printf("%.2f", d1);

    }

}