public class Capstone implements LibraryResource {
    private String capstone;

    public Capstone(String capstone) {
        this.capstone = capstone;
    }

    @Override
    public void borrow() {
        System.out.println(capstone + " has been borrowed by a student.");
    }
}