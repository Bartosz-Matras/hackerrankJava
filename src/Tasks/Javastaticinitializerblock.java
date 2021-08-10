package Tasks;

import java.util.Scanner;

public class Javastaticinitializerblock {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        if (-100 <= b && b <= 100 && -100 <= h && h <= 100){
            if (b > 0 && h > 0){
                System.out.println(b * h);
            }else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }
}
