package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> integerList = new ArrayList<>();
        Integer[] integers = new Integer[n];
        String[] strings = bufferedReader.readLine().split(" ");
        int i = 0;

        for (String s : strings){
            integers[i] = Integer.parseInt(s);
            integerList.add(integers[i]);
            i++;
        }
        bufferedReader.close();

        int result = simpleArraySum(integerList);
        System.out.println(result);
    }

    public static int simpleArraySum(List<Integer> ar){
        int result = 0;

        for (Integer i : ar){
            result += i;
        }

        return result;
    }
}
