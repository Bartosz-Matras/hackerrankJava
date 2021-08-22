package Tasks;

import java.util.Scanner;

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBook myBook = new MyBook();
        myBook.setTitle(scanner.nextLine());
        scanner.close();
        System.out.println("The title is: " + myBook.getTitle());
    }
}

abstract class Book{
    String title;
    abstract void  setTitle(String s);

    String getTitle(){
        return this.title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        this.title = s;
    }
}