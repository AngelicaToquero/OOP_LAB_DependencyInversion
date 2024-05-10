public class Book implements LibraryResource {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrowResource(Student student) {
        System.out.println(bookTitle + " has been borrowed by " + 
                            "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                            "\nStudent ID: " + student.getStudentNo() + 
                            "\nProgram: " + student.getProgram());

    }
}