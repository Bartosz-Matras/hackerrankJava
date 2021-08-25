package Tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java1DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i<arr.size(); i++){
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        for (Integer a : arr){
            System.out.println(a);
        }
    }
}
