package Tasks;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String big = scanner.next();
        scanner.close();

        BigInteger bigInteger = new BigInteger(big);
        if (bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
