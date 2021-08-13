package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class VeryBigSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Long> longList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());
        bufferedReader.close();

        Long result = 0L;
        for (Long i : longList){
            if (0 <= i && i <= Math.pow(10, 10)){
                result += i;
            }
        }
        System.out.println(result);
    }
}
