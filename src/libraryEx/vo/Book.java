package libraryEx.vo;

public class Book {
    private int no;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(int no, String title, String author, String genre, boolean available) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
