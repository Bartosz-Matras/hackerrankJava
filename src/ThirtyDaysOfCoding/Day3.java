package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine());
        int tip_percent = Integer.parseInt(bufferedReader.readLine());
        int tax_percent = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        double tip = (meal_cost / 100) * tip_percent;
        double tax = (meal_cost / 100) * tax_percent;
        double total_cost = meal_cost + tip + tax;

        System.out.println(Math.round(total_cost));
    }
}
