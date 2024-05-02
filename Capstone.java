public class Capstone implements LibraryResource {
    private String capstoneTitle;

    public Capstone(String capstoneTitle) {
        this.capstoneTitle = capstoneTitle;
    }

    @Override
    public void borrow() {
        System.out.println(capstoneTitle + " has been borrowed by a student.");
    }
}