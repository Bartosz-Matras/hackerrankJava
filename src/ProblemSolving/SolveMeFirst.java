package ProblemSolving;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (1 <= a && a <= 1000 && 1 <= b && b <= 1000){
            System.out.println(a+b);
        }
    }
}
