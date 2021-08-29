package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integerList = new LinkedList<>();

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < n; i++){
            integerList.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        bufferedReader.close();

        for (int i : integerList){
            System.out.print(i + " ");
        }
    }
}
