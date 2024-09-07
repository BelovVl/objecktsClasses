public class Book {
    private String titleBook;
    private Author author;
    private int publisherYear;

    public Book(String titleBook, Author author, int publisherYear) {
        this.titleBook = titleBook;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    ///публикации подлежит книга старше 1990 года
    public boolean isAdult() {
        return this.getPublisherYear() > 1990;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book life1 = (Book) other;
        return titleBook.equals(life1.titleBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(titleBook);
    }

    @Override
    public String toString() {
        return "Название кники: " + titleBook + ". Автор книги: " + author.getFirstName() + author.getLastName() + ". Год Публикации:" + publisherYear + ".";
    }
}
