public interface IBook {
    String getTitle();

    String getAuthor();

    int getPublishYear();

    int getPageNumber();

    boolean getIsAvailable();

    void borrowBook();

    void returnBook();
}
