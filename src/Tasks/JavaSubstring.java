package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] input = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        Integer start = Integer.parseInt(input[0]);
        Integer end = Integer.parseInt(input[1]);

        String sub = s.substring(start, end);
        System.out.println(sub);
    }
}
