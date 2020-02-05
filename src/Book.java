public class Book {
    private String title;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;


    public Book() {

    }

    public Book(String title,String author,String description,int price, boolean isInStock){

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getDisplayText(){
        return getAuthor() +" "+ getTitle()+ " " + getDescription();
    }

}

 /* Create a project in IntelliJ called BookApplication.

        Create a Book class that allows for Book title, author, description, price and isInStock variables

        The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.



        The application shall also contain getters and setters for each private member variable.

        Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.



        Publish your solution to GitHub and submit your GitHub url as the assignment.*/
