package Tasks;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();
        if (input.isEmpty()){
            System.out.println("0");
        }else {
            if (1 <= input.length() && input.length() <= 4 * Math.pow(10,5)){
                String[] strings = input.split("[\\s!,?._'@]+");
                System.out.println(strings.length);
                for (var s : strings){
                    System.out.println(s);
                }
            }
        }
    }
}
