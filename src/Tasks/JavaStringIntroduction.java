package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringIntroduction {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();

        Integer length = a.length() + b.length();
        System.out.println(length);
        if (a.compareTo(b) > 0){
            System.out.println("No");
        }else if (a.compareTo(b) < 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String a1 = a.substring(0,1).toUpperCase() + a.substring(1);
        String b1 = b.substring(0,1).toUpperCase() + b.substring(1);

        System.out.println(a1 + " " + b1);
    }
}
