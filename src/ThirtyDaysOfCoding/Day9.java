package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Map<String, String> stringMap = new HashMap<>();

        for (int i = 0; i < n; i++){
            String[] input = bufferedReader.readLine().split(" ");
            bufferedReader.readLine();
            stringMap.put(input[0], input[1]);
        }

        String[] strings = new String[n];
        for (int i =0; i < strings.length; i++){
            strings[i] = bufferedReader.readLine();
        }

        bufferedReader.close();
        if (1 <= n && n <= Math.pow(10, 5) && 1 <= strings.length && strings.length <= Math.pow(10, 5)){
            for (int i = 0; i < n; i++){
                if (stringMap.get(strings[i]) == null){
                    System.out.println("Not found");
                }else{
                    System.out.println(strings[i] + "=" + stringMap.get(strings[i]));
                }
            }
        }


        // =================================
        // Second version
        // =================================


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < n; i++){
//            String name = scanner.next();
//            int phone = scanner.nextInt();
//            scanner.nextLine();
//            myMap.put(name, phone);
//        }
//        while (scanner.hasNext()){
//            String s = scanner.next();
//            if (myMap.get(s) == null){
//                System.out.println("Not found");
//            }else{
//                System.out.println(s + "=" + myMap.get(s));
//            }
//        }
//        scanner.close();
    }
}
