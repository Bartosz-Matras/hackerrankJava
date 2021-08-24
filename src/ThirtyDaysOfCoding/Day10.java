package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int result = Result.factorial(n);
        System.out.println(result);
    }
}

class Result{

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}