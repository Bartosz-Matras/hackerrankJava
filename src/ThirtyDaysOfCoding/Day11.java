package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        List<Integer> binaryList = new ArrayList<>();
        List<Integer> listOfNumber = new ArrayList<>();

        while (n > 0){
            binaryList.add(n%2);
            n = n / 2;
        }
        Collections.reverse(binaryList);


        for(int i = 0; i < binaryList.size(); i++){
//            System.out.print(binaryList.get(i));
            int sum = 0;
            for (int j = i; j < binaryList.size(); j++){
                if (binaryList.get(j) == 1){
                    sum += 1;
                }else{
                    break;
                }
            }
            listOfNumber.add(sum);
        }

//        System.out.println();
//        for (Integer i : listOfNumber){
//            System.out.println(i);
//        }

        System.out.println(Collections.max(listOfNumber, null));
    }
}
