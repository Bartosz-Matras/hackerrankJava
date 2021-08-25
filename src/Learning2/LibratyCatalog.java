package Learning2;

import java.util.HashMap;
import java.util.Map;


public class LibratyCatalog {

    // Properties/Fields/Global Variables
    public Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;


    // Constructors
    public LibratyCatalog(Map<String, Book> bookCollection){
        this.bookCollection = bookCollection;
    }

    public LibratyCatalog(Map<String, Book> bookCollection, int lengthOfCheckoutPeriod,
                          double initialLateFee, double feePerLateDay ){
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }


    // Getters
    public int getCurrentDay(){
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle){
       return getBookCollection().get(bookTitle);
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }


    // Setters
    public void nextDay(){
        currentDay++;
    }

    public void setDay(int day){
        this.currentDay = day;
    }

    // Instance methods
    public void checkOutBook(String title){
        Book book = getBook(title);
        if (book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " +
                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0){
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue.");
        }else{
            System.out.println("Book Returned. Thank you!");
        }

        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
                "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 832, 99932);
        bookCollection.put("Harry Potter", harry);

        LibratyCatalog lib = new LibratyCatalog(bookCollection);

        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}
