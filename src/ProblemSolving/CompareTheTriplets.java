package ProblemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        for (Integer i : result){
            System.out.println(i + " ");
        }

        bufferedReader.close();
    }
}

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        if (a.size() == b.size()){
            List<Integer> result = new ArrayList<>();
            int alice = 0;
            int bob = 0;

            for (int i=0; i <a.size(); i++){
                if (a.get(i) > b.get(i)){
                    alice += 1;
                }else if (a.get(i).equals(b.get(i))){
                    continue;
                }else{
                    bob += 1;
                }
            }
            result.add(alice);
            result.add(bob);
            return result;
        }
        return null;
    }
}
