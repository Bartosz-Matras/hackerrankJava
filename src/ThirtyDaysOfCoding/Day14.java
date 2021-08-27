package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String title = bufferedReader.readLine();
        String author = bufferedReader.readLine();
        int price = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        Book myBook = new MyBook(title, author, price);
        myBook.display();
    }
}

abstract class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    abstract void display();
}

class MyBook extends Book{

    MyBook(String title, String author, int price){
        super(title, author, price);
    }

    void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
