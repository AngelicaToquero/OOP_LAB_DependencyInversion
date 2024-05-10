public class Newspaper implements LibraryResource {
    private String newspaperName;

    public Newspaper(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    @Override
    public void borrowResource(Student student) {
        System.out.println(newspaperName + " has been borrowed by " + 
                            "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                            "\nStudent ID: " + student.getStudentNo() + 
                            "\nProgram: " + student.getProgram());
    }
}