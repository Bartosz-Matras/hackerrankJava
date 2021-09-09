package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day26 {

    public static boolean isPrime(int t){
        int sum = 0;
        for (int i = 1; i <= t/2; i++){
            if (t % i == 0){
                sum += 1;
            }
            if (sum > 2){
                break;
            }
        }
        return sum == 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < n; i++){
            int t = Integer.parseInt(bufferedReader.readLine().trim());
            if (isPrime(t)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        bufferedReader.close();
    }
}

/*
boolean flag = false;
        if (t == 1)
            return false;
        int  i = 2;
        while (i <= t / 2){
            if (t % i == 0){
                flag = true;
                break;
            }

            ++i;
        }
        return !flag;
 */