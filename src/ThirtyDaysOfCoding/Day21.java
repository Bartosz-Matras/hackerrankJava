package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n - 1; j++){
                if (a.get(j) > a.get(j+1)){
                    Collections.swap(a, j, j+1);
                    numberOfSwaps += 1;
                }
            }
            if (numberOfSwaps == 0){
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

        bufferedReader.close();
    }
}
