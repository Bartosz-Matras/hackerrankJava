package Tasks;


import java.io.IOException;
import java.util.Scanner;

public class Javaendoffile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; scanner.hasNextLine() == true; i++){
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
