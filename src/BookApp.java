import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book_a = new Book();
        book_a.setAuthor("Karen Smith");
        book_a.setTitle("It's Tough to be Karen");
        book_a.setDescription("It's Not Good to be Named Karen These Days");
        book_a.setPrice(20.00);
        book_a.setInStock(true);
        Book book_b = new Book();
        book_b.setAuthor("Ted Laf");
        book_b.setTitle("High Times");
        book_b.setDescription("Ted's Excellent Life Travelling the Friendly Skies");
        book_b.setPrice(30.00);
        book_b.setInStock(true);
        Book book_c = new Book();
        book_c.setAuthor("Hilda Beauregaurd");
        book_c.setTitle("My Life After Reform School");
        book_c.setDescription("You can become a better person");
        book_c.setPrice(50.25);
        book_c.setInStock(false);
        System.out.println(book_a.getDisplayText());
        System.out.println(book_b.getDisplayText());
        double book_price = 0;

        System.out.println("Which book is being ordered?(book_a, book_b, book_c) ");
        String book = sc.nextLine();
        if (book.equalsIgnoreCase("book_a")) {
            boolean x = book_a.isInStock();
            if (x == true) {
                System.out.println("How many books are being ordered? ");
                double quantity = sc.nextDouble();
                sc.nextLine();
                book_price = book_a.getPrice() * quantity;

            }
            else {
                System.out.println("I'm sorry, that book is not available.");
            }
        }
        if (book.equalsIgnoreCase("book_b")) {
            boolean x = book_b.isInStock();
            if (x == true) {
                System.out.println("How many books are being ordered? ");
                double quantity = sc.nextDouble();
                sc.nextLine();
                book_price = book_b.getPrice() * quantity;
            }
            else {
                System.out.println("I'm sorry, that book is not available.");
            }
        }
        if (book.equalsIgnoreCase("book_c")) {
            boolean x = book_c.isInStock();
            if (x == true) {
                System.out.println("How many books are being ordered? ");
                double quantity = sc.nextDouble();
                sc.nextLine();
                book_price = book_c.getPrice() * quantity;
            }
            else {
                System.out.println("I'm sorry, that book is not available.");
            }
        }




        /*if (book.equalsIgnoreCase("book_a")) {
            book_price=book_a.getPrice();
        }
        else if (book.equalsIgnoreCase("book_b")) {
            book_price=book_b.getPrice();
        }
        else if (book.equalsIgnoreCase("book_c")) {
            book_price=book_c.getPrice();
        }*/


            /*System.out.println("Do you want to order another book? y/n");
            sc.nextLine();*/


        System.out.println("The price of your order is: " + book_price);




   /* Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100,
        if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide).*/


    }

}