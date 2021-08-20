package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (2 <= n && n <= 20){
            for(int i = 1; i<=10; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }
    }
}
