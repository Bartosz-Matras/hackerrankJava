package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> integerList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        bufferedReader.close();

        Result3.plusMinus(integerList);
    }
}

class Result3{
    public static void plusMinus(List<Integer> arr){
        int zeros = 0;
        int positive = 0;
        int negative = 0;

        for (Integer i : arr){
            if (i == 0){
                zeros += 1;
            }else if(i > 0){
                positive += 1;
            }else{
                negative += 1;
            }
        }
        System.out.println((double) positive / arr.size());
        System.out.println((double) negative / arr.size());
        System.out.println((double) zeros / arr.size());
    }
}