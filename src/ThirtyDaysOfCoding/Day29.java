package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day29 {

//    static Map<String, String> map = new HashMap<>();
    static LinkedList<String> linkedList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < n; i++){
            String[] inputs = bufferedReader.readLine().split(" ");
            addPattern(inputs[0], inputs[1]);
        }

        bufferedReader.close();

        Collections.sort(linkedList);
        for (String s : linkedList){
            System.out.println(s);
        }
    }

    public static void addPattern(String name, String email){
        Pattern pattern = Pattern.compile(".+@gmail\\.com");
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()){
            linkedList.add(name);
        }
    }
}


/*
public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
 */