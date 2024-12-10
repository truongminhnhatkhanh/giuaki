package QLyThuVien;

public class Book {
    private static int count = 1;
    private int id;
    private String title;
    private String author;
    private String genre;
    private int year;
    //true is available, false is borrowed
    private boolean status = true;

    public Book(){
        this.id = count++;
    }

    public Book(int id, String title, String author,
                String genre, int year, boolean status) {
        this.id = count++;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.status = status;
    }

    public int getId() {
        return id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status = true) {
            return "Book{" +
                    "id=" + getId() +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", genre='" + genre + '\'' +
                    ", year=" + year +
                    ", status= available" +
                    '}';
        } else {
            return "Book{" +
                    "id=" + getId() +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", genre='" + genre + '\'' +
                    ", year=" + year +
                    ", status= borrowed" +
                    '}';
        }
    }
}
