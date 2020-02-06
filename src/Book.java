public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //stock constructor
    public Book() {

    }

    //overloaded constructor
    public Book(String title, String author, String description, int price, boolean isInStock) {

    }

    //getters amd setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getDisplayText() {
        return getAuthor() + " " + getTitle() + " " + getDescription();
    }


}



   /* Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100, if they are in stock.
        If they are not in stock, that should be handled appropriately (hint - you decide).*/