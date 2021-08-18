package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(bufferedReader.readLine().trim());
        bufferedReader.close();

        if (0 <= payment && payment <= Math.pow(10, 9)) {
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }

        //12324.134
    }
}
