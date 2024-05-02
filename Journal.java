public class Journal implements LibraryResource {
    private String journal;

    public Journal(String journal) {
        this.journal = journal;
    }

    @Override
    public void borrow() {
        System.out.println(journal + " has been borrowed by a student.");
    }

    public String getJournal() {
        return journal;
    }
}