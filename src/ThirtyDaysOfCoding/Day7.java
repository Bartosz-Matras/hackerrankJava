package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        String[] strings = new String[t];
        for (int i = 0; i < t; i++){
            strings[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

        if (1 <= t && t <= 10){
            for (String s : strings){
                List<Character> odd = new ArrayList<>();
                List<Character> even = new ArrayList<>();
                char[] myCharArray = s.toCharArray();
                if (2 <= s.length() && s.length() <= 10000){
                    for (int i = 0; i < s.length(); i++){
                        if (i % 2 == 0){
                            even.add(myCharArray[i]);
                        }else{
                            odd.add(myCharArray[i]);
                        }
                    }

                    for (Character c1 : even){
                        System.out.print(c1);
                    }
                    System.out.print(" ");
                    for (Character c2 : odd){
                        System.out.print(c2);
                    }
                    System.out.println();
                }
            }
        }
    }
}
