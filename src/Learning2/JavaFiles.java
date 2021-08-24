package Learning2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("new.txt");
        Scanner scanner = new Scanner(file);

//        System.out.println(file); // nazwa pliku
        String text = scanner.nextLine();
        System.out.println(text);

//        PrintWriter save = new PrintWriter("new.txt");
//        save.println("Ala ma kota, a kot ma Ale");
//        save.close();

    }
}
