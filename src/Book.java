public class Book {
    private String titleBook;
    private Author writerBook;
    private int publisherYear;

    public Book(String titleBook, Author writerBook, int publisherYear) {
        this.titleBook = titleBook;
        this.writerBook = writerBook;
        this.publisherYear = publisherYear;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public Author getWriterBook() {
        return this.writerBook;
    }
    public int getPublisherYear() {
        return this.publisherYear;
    }
    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}
