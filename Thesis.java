public class Thesis implements LibraryResource {
    private String thesisTitle;

    public Thesis(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void borrow() {
        System.out.println(thesisTitle + " has been borrowed by a student.");
    }
}