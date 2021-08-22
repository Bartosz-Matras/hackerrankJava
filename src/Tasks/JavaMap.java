package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            String name = bufferedReader.readLine();
            int phone = Integer.parseInt(bufferedReader.readLine());
            myMap.put(name, phone);
        }
        String s;
        while ((s = bufferedReader.readLine()) != null){
            if (myMap.containsKey(s)){
                System.out.println(s + "=" + myMap.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        bufferedReader.close();
    }
}
