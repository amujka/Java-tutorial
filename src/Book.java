public class Book {
    private static int idCounter = 1; // Static counter to generate unique ids
    private final String title;
    private final String author;
    private final int id;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return " ID: " + id + ", TITLE: " + this.title + ", AUTHOR: " + this.author;
    }
}
