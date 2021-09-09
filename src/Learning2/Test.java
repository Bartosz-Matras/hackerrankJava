package Learning2;

import java.io.Console;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
//        System.out.println(2.0 - 1.1); // 0.8999999999999999
//        System.out.println("sda\u2122");  // sda™
//        System.out.println("\u03C0");  // π

//        String greeting = "Cześć";
//        int cpCount = greeting.codePointCount(0, greeting.length());
//        int index = greeting.offsetByCodePoints(0, 1);
//        int cp = greeting.codePointAt(index);
//        System.out.println("cpCount: " + cpCount);
//        System.out.println("Index: " + index);
//        System.out.println("cp: " + cp);

        final int NMAX = 10;

        int[][] odds = new int[NMAX+1][];
//        System.out.println(odds.length); // odds.length == 11

        for (int n = 0; n <= NMAX; n++){
            odds[n] = new int[n+1];
        }

        for (int n = 0; n < odds.length; n++){
            for (int k = 0; k < odds[n].length; k++){
                int lotteryOdds = k;
//                for (int i = 1; i <= k; k++){
////                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
//                }

                odds[n][k] = lotteryOdds;
            }
        }

        for (int[] row : odds){
            for (int odd : row){
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
