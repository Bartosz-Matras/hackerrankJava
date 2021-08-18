package Learning;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaNumberFormat {
    public static void main(String[] args) {
        // Java NumberFormat formatting numbers
        System.out.println("Java NumberFormat formatting numbers: ");
        double n = 1240.35;

        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        String val = nf.format(n);
        System.out.println(val);

        NumberFormat nf2 = NumberFormat.getInstance(new Locale("sk", "SK"));
        String val2 = nf2.format(n);
        System.out.println(val2);

        NumberFormat nf3 = NumberFormat.getInstance(new Locale("da", "DK"));
        String val3 = nf3.format(n);
        System.out.println(val3);
        System.out.println();
        System.out.println();


        // Java NumberFormat grouping digits
        System.out.println("Java NumberFormat grouping digits:");
        long valu = 23_500_390_800_380L;

        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("sk", "SK"));

        numberFormat.setGroupingUsed(true);
        System.out.println(numberFormat.format(valu));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(valu));
        System.out.println();
        System.out.println();


        // Java NumberFormat fraction digits
        System.out.println("Java NumberFormat fraction digits:");

        double value1 = 4.5678934;
        double value2 = 2.3;

        NumberFormat numberFormat1 = NumberFormat.getInstance(new Locale("sk", "SK"));
        numberFormat1.setMinimumFractionDigits(2);
        numberFormat1.setMaximumFractionDigits(4);

        System.out.println(numberFormat1.format(value1));
        System.out.println(numberFormat1.format(value2));
        System.out.println();
        System.out.println();


        // Java NumberFormat rounding numbers
        System.out.println("Java NumberFormat rounding numbers:");

        double nums[] = {2.32, 2.55, 3.19, 4.88, 5.54, 3.22, 8.78};
        NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat2.setMaximumFractionDigits(1);
        numberFormat2.setRoundingMode(RoundingMode.UP);

        for (double num : nums){
            String number = numberFormat2.format(num);
            System.out.printf("%s ", number);
        }

        System.out.println();

        numberFormat2.setRoundingMode(RoundingMode.DOWN);
        for (double num : nums){
            String number = numberFormat2.format(num);
            System.out.printf("%s ", number);
        }
        System.out.println();
        System.out.println();


        // NumberFormat formatting percentages
        System.out.println("NumberFormat formatting percentages:");
        double x = 25f / 100f;

        NumberFormat pf = NumberFormat.getPercentInstance(new Locale("sk", "SK"));
        System.out.println(pf.format(x));
        System.out.println();
        System.out.println();


        // Java NumberFormat formatting currencies
        System.out.println("Java NumberFormat formatting currencies:");
        int value = 23_500;

        NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.println(cf1.format(value));


        NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
        System.out.println(cf2.format(value));

        NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        System.out.println(cf3.format(value));
    }
}
