package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day19 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        bufferedReader.close();

        char[] chars = input.toCharArray();
        int z = 0;

        for (int i = 0; i < input.length(); i++){
            Character c1 = chars[i];
            Character c2 = chars[chars.length-1-i];
            if (c1.equals(c2)){
                z += 1;
            }
        }

        if (z == chars.length){
            System.out.println("The word, " + input + ", is a palindrome.");
        }else{
            System.out.println("The word, " + input + ", is not a palindrome.");
        }
    }
}
