package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        bufferedReader.close();

        try{
            if (1 <= s.length() && s.length() <= 6){
                int a = Integer.parseInt(s);
                System.out.println(a);
            }

        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
