package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraysDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());
        bufferedReader.close();

        List<Integer> newArr = new ArrayList<>();
        int j = 1;
        for (int i : arr){
            newArr.add(arr.get(arr.size() - j));
            j ++;
        }
        for (int i : newArr){
            System.out.print(i + " ");
        }
    }
}
