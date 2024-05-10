public class Library {
    private final LibraryResource libraryResource;

    public Library(LibraryResource libraryResource) {
        this.libraryResource = libraryResource;
    }

    public void borrowResource(Student student) {
        libraryResource.borrowResource(student);
    }
}