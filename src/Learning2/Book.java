package Learning2;

public class Book {

    private String title;
    private int pageCount;
    private int ISBN;
    private boolean isCheckedOut; // whether or not the book is checked out
    private int dayCheckedOut = -1;

    // Constructor
    public Book(String title, int pageCount, int ISBN){
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    // Getters and setters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setIsCheckedOut(boolean isCheckedOut, int dayCheckedOut) {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }


}
