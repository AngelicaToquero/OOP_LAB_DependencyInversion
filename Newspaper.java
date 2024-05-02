public class Newspaper implements LibraryResource {
    private String newspaper;

    public Newspaper(String newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public void borrow() {
        System.out.println(newspaper + " has been borrowed by a student.");
    }
}