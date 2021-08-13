package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try{
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        });

        int result = ResultDiagonalDifference.diagonalDifference(arr);

        System.out.println(result);
            }
}

class ResultDiagonalDifference{

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer leftToRight = 0;
        Integer rightToLeft = 0;

        for (int i=0; i<arr.size(); i++){
            for (int j=0; j<arr.get(0).size(); j++){
                if (-100 <= arr.get(i).get(j) && arr.get(i).get(j) <= 100){
                    if (i == j){
                        leftToRight += arr.get(i).get(j);
                    }
                    if (i + j == arr.size()-1){
                        rightToLeft += arr.get(i).get(j);
                    }
                }
            }
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}