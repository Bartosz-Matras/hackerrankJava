package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Day30 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr ->{
            try{
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result2.bitwiseAnd(count, lim);
                System.out.println(res);
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

class Result2{

    public static int bitwiseAnd(int count, int lim){
        int max = 0;

        for (int i = 1; i <= count; i++){
            for (int j = i+1; j <= count; j++){
                int sum = i&j;
                if (sum > max && sum < lim){
                    max = sum;
                }
            }
        }
        return max;
    }

}
