package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        Result4.staircase(n);
    }
}

class Result4 {
    public static void staircase(int n){
        for (int i = 1; i <= n; i++){
            System.out.println(" ".repeat(n-i) + "#".repeat(i));
        }
    }
}