package PracticeLessons.Lesson291024.Tasks.Task2;

public class Book {

    private String title;
    private String author;
    private double price;
    private boolean isOnSale;
    private int count;

    public Book(String title, String author, double price, boolean isOnSale, int count) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isOnSale = isOnSale;
        this.count = count;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isOnSale=" + isOnSale +
                ", count=" + count +
                '}';
    }
}
