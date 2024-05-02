public class Newspaper implements LibraryResource {
    private String newspaperName;

    public Newspaper(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    @Override
    public void borrow() {
        System.out.println(newspaperName + " has been borrowed by a student.");
    }
}