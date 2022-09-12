import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorFullName;
    private int publicationYear;

    public Book(String bookName, Author authorFullName, int publicationYear) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorFullName() {
        return this.authorFullName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

//    public String authorFullName() {
//        String authorName = authorFullName.getAuthorName();
//        String authorLastName = authorFullName.getAuthorLastName();
//        return authorName + " " + authorLastName;
//    }

    @Override
    public String toString() {
        return "Book name - " + bookName + ", Author full name - " + authorFullName.getAuthorName() + " " + authorFullName.getAuthorLastName() + ", Publication year - " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorFullName.equals(book.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorFullName);
    }
}
