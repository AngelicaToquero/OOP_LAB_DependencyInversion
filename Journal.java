public class Journal implements LibraryResource {
    private String journalTitle;

    public Journal(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrow() {
        System.out.println(journalTitle + " has been borrowed by a student.");
    }
}