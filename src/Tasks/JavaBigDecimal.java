package Tasks;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next().trim());
        String[] strings = new String[n];
        for (int i =0; i<n; i++){
            strings[i] = scanner.next();
        }
        scanner.close();

        if (1 <= n && n <= 200){
            Arrays.sort(strings, Collections.reverseOrder(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    BigDecimal a = new BigDecimal(o1);
                    BigDecimal b = new BigDecimal(o2);
                    return a.compareTo(b);
                }
            }));
            for (String s : strings){
                System.out.println(s);
            }
        }
    }


}
