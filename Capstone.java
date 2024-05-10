public class Capstone implements LibraryResource {
    private String capstoneTitle;

    public Capstone(String capstoneTitle) {
        this.capstoneTitle = capstoneTitle;
    }

    @Override
    public void borrowResource(Student student) {
        System.out.println(capstoneTitle + " has been borrowed by " + 
                            "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                            "\nStudent ID: " + student.getStudentNo() + 
                            "\nProgram: " + student.getProgram());
    }
}