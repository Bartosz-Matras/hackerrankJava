package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day18 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < n; i++){
            try{
                String[] integers = bufferedReader.readLine().split(" ");
                int w = calculator.power(Integer.parseInt(integers[0]), Integer.parseInt(integers[1]));
                System.out.println(w);
            }catch (Exception e){
                System.out.println("n and p should be non-negative");
            }
        }

        bufferedReader.close();
    }
}

class Calculator {

    int power(int n, int p) throws Exception{
        if (n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }

}