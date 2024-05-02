public class Book implements LibraryResource {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrow() {
        System.out.println(bookTitle + " has been borrowed by a student.");
    }
}