package Learning2;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++){
            int r = (int) (Math.random() * n);
//            System.out.println(r);

            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }

        Arrays.sort(result);
        for (int r : result){
            System.out.println(r);
        }

        scanner.close();
    }
}
