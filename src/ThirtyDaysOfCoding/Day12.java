package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try{
                arr.add(
                  Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                          .map(Integer::parseInt)
                          .collect(Collectors.toList())
                );
            }catch (IOException ex){
                throw new RuntimeException();
            }
        });

        bufferedReader.close();

        List<Integer> listOfSum = new ArrayList<>();

        for (int i = 0; i <= arr.size() / 2 ; i++){
            for (int j = 0; j <= arr.size() / 2; j++){
                int sum = 0;
                for (int k = i; k < (arr.size() / 2) + i; k++){
                    for (int z = j; z < (arr.size() / 2) + j; z++){
                        if (k == i || k == i+2){
                            sum += arr.get(k).get(z);
                        }else if (z+i == k+j){
                            sum += arr.get(k).get(z);
                        }
                    }
                }
                listOfSum.add(sum);
            }
        }
        System.out.println(Collections.max(listOfSum, null));
//        int o = 0;
//        for (Integer i : listOfSum){
//            if (o % 4 == 0){
//                System.out.println();
//            }
//            System.out.print(i + " ");
//            o++;
//        }
//        System.out.println();
//        System.out.println(listOfSum.size());

    }
}

/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 */
