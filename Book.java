public class Book implements LibraryResource {
    private String booktitle;

    public Book(String booktitle) {
        this.booktitle = booktitle;
    }

    @Override
    public void borrow() {
        System.out.println(booktitle + " has been borrowed by a student.");
    }

    public String getTitle() {
        return booktitle;
    }
}