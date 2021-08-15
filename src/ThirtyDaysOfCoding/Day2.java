package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2 {
    public static void main(String[] args) throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(bufferedReader.readLine().trim());
        double d1 = Double.parseDouble(bufferedReader.readLine().trim());
        String s1 = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);
    }
}
