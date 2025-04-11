import java.util.Scanner;

class Publisher {
    String name;
    int year;

    Publisher(String name, int year) {
        this.name = name;
        this.year = year;
    }
}

class Book extends Publisher {
    String title;
    String author;
    int pages;
    double price;
    String category;

    Book(String name, int year, String title, String author, int pages, double price, String category) {
        super(name, year);
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Category: " + category);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
        System.out.println("Publisher: " + name + " (" + year + ")");
        System.out.println("---------------------");
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n   Book Menu  \n  ");
            System.out.println("1. Literature ");
            System.out.println("2. Fiction ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2) {
                System.out.print("Publisher: ");
                String pubName = sc.nextLine();

                System.out.print("Year : ");
                int pubYear = sc.nextInt();
                sc.nextLine();

                System.out.print("Title : ");
                String title = sc.nextLine();

                System.out.print("Author : ");
                String author = sc.nextLine();

                System.out.print("Pages : ");
                int pages = sc.nextInt();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                String category = (choice == 1) ? "Literature" : "Fiction";

                Book book = new Book(pubName, pubYear, title, author, pages, price, category);
                book.display();
            } else if (choice == 3) {
                System.out.println("Exiting ...");
            } else {
                System.out.println("Invalid choice. ");
            }

        } while (choice != 3);

        sc.close();
    }
}
