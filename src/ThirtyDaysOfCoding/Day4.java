package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if(n % 2 == 1){
            System.out.println("Weird");
        }else{
            if (2 <= n && n <= 5){
                System.out.println("Not Weird");
            }else if(6 <= n && n <= 20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }
    }
}
