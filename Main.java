package QLyThuVien;

import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        boolean go = true;
        while (go) {
            System.out.println("Library Management System");
            System.out.println("1. Create Library");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Search Books");
            System.out.println("5. Display All Books");
            System.out.println("6. Display Library Info");
            System.out.println("7. Sort Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Library ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    library.setId(id);
                    System.out.print("Enter Library Name: ");
                    String name = sc.nextLine();
                    library.setName(name);
                    System.out.println();
                    break;
                case 2:
                    library.addBook();
                    System.out.println();
                    break;
                case 3:
                    library.deleteBook();
                    System.out.println();
                    break;
                case 4:
                    library.searchBook();
                    System.out.println();
                    break;
                case 5:
                    library.displayBook();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("==========LIBRARY INFO======= ");
                    System.out.println(library.toString());
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Choose sort by 'year' or 'title': ");
                    String sortBy = sc.nextLine();
                    if (sortBy.equals("year")) {
                        library.getBooks().sort(Comparator.comparingInt(Book::getYear));
                    }else if (sortBy.equals("title")) {
                        library.getBooks().sort(Comparator.comparing(Book::getTitle));
                    }
                    System.out.println("Sort by " + sortBy + "sucessfully");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    go = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
