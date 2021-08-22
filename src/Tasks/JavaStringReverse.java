package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] chars = input.toCharArray();

        int x = 0;

        for (int i = 0; i <chars.length ; i++){
            if (chars[i] == chars[chars.length-i-1]){
                x+=1;
            }
        }
        if (x == chars.length)
            System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
