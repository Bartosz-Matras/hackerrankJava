package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15 {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] strings = bufferedReader.readLine().split(" ");

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            integerList.add(Integer.parseInt(strings[i]));
        }

        bufferedReader.close();

        int max = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j > i){
                    int item = Math.abs(integerList.get(j) - integerList.get(i));
                    if (item > max){
                        max = item;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
