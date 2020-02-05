public class BookApp {
    public static void main (String[]args){


    Book book_a = new Book();
        book_a.setAuthor("Karen Smith");
        book_a.setTitle("It's Tough to be Karen");
        book_a.setDescription("It's not good to be named Karen these days");
     Book book_b = new Book();
        book_b.setAuthor("Ted Laf");
        book_b.setTitle("High Times");
        book_b.setDescription("Ted's excellent life travelling the friendly skies");
        System.out.println(book_a.getDisplayText());
        System.out.println(book_b.getDisplayText());


    }

}







   /* Create a project in IntelliJ called BookApplication.

        Create a Book class that allows for Book title, author, description, price and isInStock variables

        The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.



        The application shall also contain getters and setters for each private member variable.

        Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.



        Publish your solution to GitHub and submit your GitHub url as the assignment.*/