import java.time.Year;

public abstract class Book implements IBook {

    private String title;
    private String author;
    private int publishYear;
    private int pageNumber;
    private boolean isAvailable;

    @Override
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear >= 1900 && publishYear <= Year.now().getValue()) {
            this.publishYear = publishYear;
        }
    }

    @Override
    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber > 0) {
            this.pageNumber = pageNumber;
        }
    }

    @Override
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public void borrowBook() {
        this.isAvailable = false;
    }

    @Override
    public void returnBook() {
        this.isAvailable = true;
    }
}
