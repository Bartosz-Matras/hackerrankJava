package Tasks;

import java.util.Scanner;

public class Javainttostring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (-100 <= n && n <= 100){
            try{
                String s = Integer.toString(n);
                System.out.println("Good job");
            }catch (Exception e){
                System.out.println("Wrong answer");
            }
        }else{
            System.out.println("Wrong answer");
        }
    }
}
