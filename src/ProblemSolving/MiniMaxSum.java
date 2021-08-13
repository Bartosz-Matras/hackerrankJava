package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integerList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        bufferedReader.close();
//        System.out.println(Integer.MAX_VALUE);
        Result5.minMaxSum(integerList);
    }
}

class Result5 {
    public static void minMaxSum(List<Integer> arr){
        List<Long> integerList = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            integers.add(arr.get(0));
        }

        if (arr.equals(integers)) {
            Long sum = 0L;
            for (int i=0; i<arr.size()-1; i++){
                sum+= arr.get(0);
            }
            System.out.println(sum + " " + sum);
        }else {
            for (int j = 0; j < arr.size(); j++) {
                Long sum = 0L;
                for (Integer i : arr) {
                    if (j == arr.indexOf(i)) {
                        continue;
                    } else {
                        sum += i;
                    }
                }
                integerList.add(sum);
            }
            Collections.sort(integerList);
            System.out.println(integerList.get(0) + " " + integerList.get(integerList.size()-1));
        }
    }
}