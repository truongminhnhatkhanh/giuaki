package QLyThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Library implements IBookManager{
    private int id;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public Library() {
    }

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(){
        System.out.println("=========ADD BOOK==========");
        Book book = new Book();
        System.out.println("Enter the title of the book:");
        String title = sc.nextLine();
        book.setTitle(title);
        System.out.println("Enter the author of the book:");
        String author = sc.nextLine();
        book.setAuthor(author);
        System.out.println("Enter the genre of the book:");
        String genre = sc.nextLine();
        book.setGenre(genre);
        System.out.println("Enter the publication year of the book:");
        int year = sc.nextInt();
        sc.nextLine();
        book.setYear(year);
        System.out.println("Is the book available (true/false)?");
        boolean status = sc.nextBoolean();
        book.setStatus(status);
        books.add(book);
        sc.nextLine();
        System.out.println("Book added successfully");
    }
    public void deleteBook(){
        System.out.println("=========DELETE BOOK==========");
        System.out.print("Enter Book Id:");
        int id = sc.nextInt();
        sc.nextLine();
        for(Book book : books){
            if(book.getId() == id){
                books.remove(book);
                System.out.println("Deleted!");
                return;
            }
        }
        System.out.println("Book not found!");

    }
    public void searchBook() {
        System.out.println("=========SEARCH BOOK==========");
        System.out.print("Enter title or author: ");
        String x = sc.nextLine();
        for (Book book : books) {
            if (book.getAuthor().equals(x)) {
                System.out.println(book.toString());
                return;
            } else if (book.getTitle().equals(x)) {
                System.out.println(book.toString());
            } else {
                System.out.println("Book not found!");
            }
        }
    }
    public void displayBook(){
        System.out.println("=========DISPLAY BOOK==========");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",have " + books.size() + " books" +
                ", books=" + books +
                '}';
    }
}
