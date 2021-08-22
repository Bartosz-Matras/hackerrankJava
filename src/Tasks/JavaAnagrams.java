package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;


public class JavaAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();

        Map<Character, Integer> mapA = new TreeMap<>();
        Map<Character, Integer> mapB = new TreeMap<>();
        char[] charsA = a.toLowerCase(Locale.ROOT).toCharArray();
        char[] charsB = b.toLowerCase(Locale.ROOT).toCharArray();

//        for (var z : charsA){
//            System.out.print(z + " ");
//        }
//        System.out.println();
//        for (var z : charsB){
//            System.out.print(z + " ");
//        }
//        System.out.println();

        if (1 <= a.length() && 1 <= b.length() && a.length() <= 50 && b.length() <= 50){
            for (int i = 0; i < a.length(); i++){
                if (!mapA.containsKey(charsA[i])){
                    mapA.put(charsA[i], 1);
                }else{
                    int x = mapA.get(charsA[i])+1;
                    mapA.replace(charsA[i], x);
                }
            }

            for (int i = 0; i < b.length(); i++){
                if (!mapB.containsKey(charsB[i])){
                    mapB.put(charsB[i], 1);
                }else{
                    int x = mapB.get(charsB[i]) + 1;
                    mapB.replace(charsB[i], x);
                }
            }
        }
//        for (var entry : mapA.entrySet()){
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
//        System.out.println();
//        for (var entry : mapB.entrySet()){
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }


        if (mapA.equals(mapB)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
